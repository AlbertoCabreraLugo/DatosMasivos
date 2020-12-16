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

// 6.- The features are transformed using the DataFrame
val features = vectorFeatures.transform(dataClean)

// We declare a "StringIndexer" which will transform the data in to "species" numeric values 
val speciesIndexer = new StringIndexer().setInputCol("species").setOutputCol("label")

// We adjust the indexed species with the vector features
val dataIndexed = speciesIndexer.fit(features).transform(features)

// With the variable "splits" we make a random cut
val splits = dataIndexed.randomSplit(Array(0.6, 0.4), seed = 1234L)

// The variable "train" is declared which will have 60% of the data
val train = splits(0)

// The variable "test" is declared which will have 40% of the data
val test = splits(1)

// 7.- Layer settings are established for the artificial neural network model
val layers = Array[Int](4, 2, 2, 3)

// The Multilayer algorithm trainer is configured with its respective parameters
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

// The model is trained with the training data
val model = trainer.fit(train)

// The model is tested and already trained
val result = model.transform(test)

// The prediction and the label that will be saved in the variable are selected
val predictionAndLabels = result.select("prediction", "label")

// Some data is shown
predictionAndLabels.show()

// The model precision estimate is run
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictionAndLabels)

// 8.- Error model is printed
println(s"Test Error = ${(1.0 - accuracy)}")
