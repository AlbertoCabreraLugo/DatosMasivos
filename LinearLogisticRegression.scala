// Linear Logistic regression algorithm
def logisticre():Unit={

import org.apache.spark.sql.SparkSession
import org.apache.log4j._
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer, VectorAssembler}
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.mllib.evaluation.MulticlassMetrics
import org.apache.spark.ml.Pipeline

// We use this code to minimize errors
Logger.getLogger("org").setLevel(Level.ERROR)
// We start a simple spark session
val spark = SparkSession.builder().getOrCreate()
// We load the dataset
val df = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("bank-full.csv")

val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("label")
val dataIndexed = labelIndexer.fit(df).transform(df)

// Logistic regression algorithm

val Array(training, test) = dataIndexed.randomSplit(Array(0.7, 0.3), seed = 12345)

val lr = new LogisticRegression()

val pipeline = new Pipeline().setStages(Array(assembler,lr))

val model = pipeline.fit(training)

val results = model.transform(test)

val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd

val metrics = new MulticlassMetrics(predictionAndLabels)

// Confusion matrix
println("\nAlgoritmo Logistic Regresion\n")
println("\nConfusion matrix:")
println(metrics.confusionMatrix)
println("\nExactitud:")
println(metrics.accuracy)
}

//Run algorithm
logisticre()

//Results display
val mb = 1024*1024
val runtime = Runtime.getRuntime
println("ALL RESULTS IN MB")
println("** Used Memory:  " + (runtime.totalMemory - runtime.freeMemory) / mb)
println("** Free Memory:  " + runtime.freeMemory / mb)
println("** Total Memory: " + runtime.totalMemory / mb)
println("** Max Memory:   " + runtime.maxMemory / mb)
