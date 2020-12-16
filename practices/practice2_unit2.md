# Practice 2 - Logistic Regression

Import a SparkSession with the Logistic Regression library
```scala
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.sql.SparkSession
```
Optional: Use the Error reporting code
```scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
Create a Spark session
```scala
val spark = SparkSession.builder().getOrCreate()
```
Use Spark to read the Advertising csv file.
```scala
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("advertising.csv")
```
Print the Schema of the DataFrame 
```scala
data.printSchema()

```
Print an example row and the data
```scala
data.head(1)

val colnames = data.columns
val firstrow = data.head(1)(0)
println("\n")
println("Example data row")
for(ind <- Range(1, colnames.length)){
    println(colnames(ind))
    println(firstrow(ind))
    println("\n")
}
```
## Prepare the DataFrame for Machine Learning 

### Do the next:
- Rename the column "Clicked on Ad" to "label"
- Take the following columns as features "Daily Time Spent on Site", "Age", "Area Income", "Daily Internet Usage", "Timestamp", "Male"
- Create a new column called "Hour" from the Timestamp containing the "Hour of the click"
```scala
val timedata = data.withColumn("Hour",hour(data("Timestamp")))
val logregdata = timedata.select(data("Clicked on Ad").as("label"), $"Daily Time Spent on Site", $"Age", $"Area Income", $"Daily Internet Usage", $"Hour", $"Male")

```
Import the library of Vector Assembler
```scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```

Creation of dataframe assembler
```scala
val assembler = (new VectorAssembler()
                  .setInputCols(Array("Daily Time Spent on Site", "Age","Area Income","Daily Internet Usage","Hour","Male"))
                  .setOutputCol("features"))
```
Use randomSplit to create 70/30 split test and train data
```scala
val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)
```

## Configure a Pipeline

Import a Pipeline library
```scala
import org.apache.spark.ml.Pipeline
```
Create a new logistic regression object named lr
```scala
val lr = new LogisticRegression()
```
Create a new pipeline with the elements: assembler, lr
```scala
val pipeline = new Pipeline().setStages(Array(assembler, lr))
```

Fit the pipeline for the training set
```scala
val model = pipeline.fit(training)
```
Take the Results in the Test set with transform
```scala
val results = model.transform(test)
```

## Model evaluation

Import library
```scala
import org.apache.spark.mllib.evaluation.MulticlassMetrics

```
Convert test results to RDD using .as and .rdd
```scala
val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd
```
Initialize a MulticlassMetrics object
```scala
val metrics = new MulticlassMetrics(predictionAndLabels)
```
Print the Confusion matrix
```scala
println("Confusion matrix:")
println(metrics.confusionMatrix)
```
Show the accuracy.
```scala
metrics.accuracy
```
