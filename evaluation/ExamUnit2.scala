// We add the necessary libraries to work with the Multilayer Perceptron algorithm.import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

// 1.- From the data set Iris.cvs, elaborate the necessary data cleaning by means of a scala spark script, we import the necessary libraries for cleaning.import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.{VectorAssembler, StringIndexer}
import org.apache.spark.ml.linalg.Vectors

// The data from the iris.csv dataframe is loaded into the variable "data"
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("iris.csv")

// 2.- Names of the columns
data.columns

// 3.- We see the scheme to verify that all the values are classified correctly in the datasetbar que todos los valores están clasificados correctamente en el dataset
data.printSchema()

//4.- print the first 5 columns
data.show(5)

// 5.- Use the describe () method to learn more about the data in the DataFrame.be () para aprender mas sobre los datos del  DataFrame.
data.describe().show()

// The null fields are removed
val dataClean = data.na.drop()

//A vector is declared that transforms the data to the variable "features"n vector que se transforma los datos a la variable "features"
val vectorFeatures = (new VectorAssembler().setInputCols(Array("sepal_length","sepal_width", "petal_length","petal_width")).setOutputCol("features"))
