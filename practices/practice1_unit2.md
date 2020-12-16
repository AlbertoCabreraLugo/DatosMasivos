# Practice 1 - Linear Regression

Import LinearRegression library
```scala
import org.apache.spark.ml.regression.LinearRegression
```
Optional: Use the following code to configure errors
```scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
Start a simple Spark session
```scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().appName("LinearRegressionAssigment").getOrCreate()
```
Spark is used for Clean-Ecommerce csv file
```scala
val CleanEcommerce = spark.read.option("header", "true").option("inferSchema","true")csv("Clean-Ecommerce.csv")
```
Print of schema and an example
```scala
CleanEcommerce.printSchema()
CleanEcommerce.show(1)
```
The data frame is transformed and libraries are loaded
```scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
Rename the column Yearly Amount Spent as "label". Also from the data take only the numerical column. Leave all this as a new DataFrame called df
```scala
val df = CleanEcommerce.select($"Avg Session Length", $"Time on App", $"Time on Website", $"Length of Membership", $"Yearly Amount Spent".as("label"))
```
Let the assembler object convert the input values to a vector. Use the VectorAssembler object to convert the input columns of the df to a single output column of an array called "features". Set the input columns where we are supposed to read the values.
```scala
val assembler = new VectorAssembler().setInputCols(Array("Avg Session Length", "Time on App", "Time on Website", "Length of Membership")).setOutputCol("features")
```
Use the assembler to transform our DataFrame to two columns: label and features
```scala
val dataassembler = assembler.transform(df).select($"label", $"features")
```
Create an object for line regression model and Fit the model for the data and call this model lrModel
```scala
val lr = new LinearRegression()
val lrModelo = lr.fit(dataassembler)
```
Use our model's .summary method to create an object called trainingSummary
```scala
val trainingSummary = lrModelo.summary
```
Print the coefficients and intercept for linear regression
```scala
println(s"Coefficients: ${lrModelo.coefficients} Intercept: ${lrModelo.intercept}")
```
Show the values of residuals, the RMSE, the MSE, and also the R^2
```scala
trainingSummary.residuals.show()
```
