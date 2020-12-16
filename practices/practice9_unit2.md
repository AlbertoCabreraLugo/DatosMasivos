# Practice 9 - Naive Bayes

Import libreries
```Scala
import org.apache.spark.ml.classification.NaiveBayes
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
```
Load the data saved in LIBSVM format as a DataFrame
```Scala
val data = spark.read.format("libsvm").load("C:/Users/Sebas/Desktop/sample_libsvm_data.txt")
data.show(2)
```
Separate data into training and test sets (30% reserved for testing)
```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3), seed = 1234L)
```
Train a Naive Bayes Model
```Scala
val model = new NaiveBayes().fit(trainingData)
```
Select the sample rows to display
```Scala
val predictions = model.transform(testData)
predictions.show()
```
Select (prediction, true label) and calculate test errors.
```Scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")

val accuracy = evaluator.evaluate(predictions)

println(s"Test set accuracy = $accuracy")
```
