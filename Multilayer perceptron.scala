def multipercep():Unit={

import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer, VectorAssembler}
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.linalg.Vectors

// We use this code to minimize errors
Logger.getLogger("org").setLevel(Level.ERROR)
// We start a simple spark session
val spark = SparkSession.builder().getOrCreate()
// We load dataset
val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("bank-full.csv")

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")
val features = assembler.transform(df)

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("label")
val dataIndexed = labelIndexer.fit(features).transform(features)

// Multilayer perceptron algorithm

//We divide the data in an array into parts of 70% and 30%
val split = dataIndexed.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = split(0)
val test = split(1)

// We specify the layers for the neural network
// input 5 by the number of data of the features
// 2 hidden layers of two neurons and output 2 since it is only yes or no
// depending if the client subscribed to a term deposit

val layers = Array[Int](5, 2, 3, 2)

// We create the trainer with its parameters
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

// We train the model
val model = trainer.fit(train)

// We print the accuracy
val result = model.transform(test)

// Predictions and label (original)
val predictionAndLabels = result.select("prediction", "label")
println("\nAlgoritmo  Multilayer perceptron\n")

// Model precision estimation runs
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
println(s"Accuracy test = ${evaluator.evaluate(predictionAndLabels)}")

}

//Run algorithm
multipercep()

//Results display
val mb = 1024*1024

val runtime = Runtime.getRuntime
println("ALL RESULTS IN MB")
println("** Used Memory:  " + (runtime.totalMemory - runtime.freeMemory) / mb)
println("** Free Memory:  " + runtime.freeMemory / mb)
println("** Total Memory: " + runtime.totalMemory / mb)
println("** Max Memory:   " + runtime.maxMemory / mb)
