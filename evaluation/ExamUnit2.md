# Assessment practice - Unit 2


**Instituto Tecnológico de Tijuana**

Departamento de Ciencias y Computación

Ingeniería en Sistemas Computacionales
 
 [![](https://upload.wikimedia.org/wikipedia/commons/2/2e/ITT.jpg)](https://upload.wikimedia.org/wikipedia/commons/2/2e/ITT.jpg)

**Title:**
Random Forest Classifier

**Subject:**
BDD-1704 SC9A Datos Masivos

**Unit:**
 II

**Professor:**
JOSE CHRISTIAN ROMERO HERNANDEZ


ARREDONDO GOMEZ RAMON ALEJANDRO     15210326

CABRERA LUGO ALBERTO                17210533 

**Group:**
SC9A

**Date:**
Tijuana, Baja California, November 23, 2020. 
</div>


We add the necessary libraries to work with the Multilayer Perceptron algorithm.import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
```scala
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
```
### 1.- From the data set Iris.cvs, elaborate the necessary data cleaning by means of a scala spark script, we import the necessary libraries for cleaning.import 
org.apache.spark.ml.feature.VectorAssembler
```scala
import org.apache.spark.ml.feature.{VectorAssembler, StringIndexer}
import org.apache.spark.ml.linalg.Vectors
```
The data from the iris.csv dataframe is loaded into the variable "data"
```scala
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("iris.csv")
```

### 2.- Names of the columns
```scala
data.columns
```

### 3.- We see the scheme to verify that all the values are classified correctly in the datasetbar que todos los valores están clasificados correctamente en el dataset
```scala
data.printSchema()
```

### 4.- print the first 5 columns
```scala
data.show(5)
```

### 5.- Use the describe () method to learn more about the data in the DataFrame.be () para aprender mas sobre los datos del  DataFrame.
```scala
data.describe().show()
```
The null fields are removed
```scala
val dataClean = data.na.drop()
```
A vector is declared that transforms the data to the variable "features"n vector que se transforma los datos a la variable "features"
```scala
val vectorFeatures = (new VectorAssembler().setInputCols(Array("sepal_length","sepal_width", "petal_length","petal_width")).setOutputCol("features"))
```

### 6.- We transform the features using the DataFrame
```scala
val features = vectorFeatures.transform(dataClean)
```

A "StringIndexer" is declared that transforms the data in "species" into numeric data
```scala
val speciesIndexer = new StringIndexer().setInputCol("species").setOutputCol("label")
```
We adjust the indexed species with the vector features
```scala
val dataIndexed = speciesIndexer.fit(features).transform(features)
```

With the variable "splits" we make a random cut
```scala
val splits = dataIndexed.randomSplit(Array(0.6, 0.4), seed = 1234L)
```

The variable "train" is declared which will have 60% of the data
```scala
val train = splits(0)
```

The variable "test" is declared which will have 40% of the data
```scala
val test = splits(1)
```

### 7.- Layer settings are established for the artificial neural network model

```scala
val layers = Array[Int](4, 2, 2, 3)
```

The Multilayer algorithm trainer is configured with its respective parameters
```scala
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
```

The model is trained with the training data
```scala
val model = trainer.fit(train)
```

The model is tested and already trained
```scala
val result = model.transform(test)
```

The prediction and the label that will be saved in the variable are selected
```scala
val predictionAndLabels = result.select("prediction", "label")
```

Some data is shown
```scala
predictionAndLabels.show()
```

The model precision estimate is run
```scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")
```

```scala
val accuracy = evaluator.evaluate(predictionAndLabels)
```

### 8.- Error model is printed
```scala
println(s"Test Error = ${(1.0 - accuracy)}")
```
