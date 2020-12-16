# Practice 6 - Multilayer perceptron classifier

```scala
// Import MultilayerPerceptronClassifier and MulticlassClassificationEvaluator
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
// $example off$
// Import session spark
import org.apache.spark.sql.SparkSession

/**
 * An example for Multilayer Perceptron Classification.
 */

 // Creation of the object MultilayerPerceptronClassifier
object MultilayerPerceptronClassifierExample {

// The main function is defined which has as a parameter an Array of type string
  def main(): Unit = {
    // The SparkSession class object is created, and the app is given the name of
    // MultilayerPerceptronClassifierExample
    val spark = SparkSession
      .builder
      .appName("MultilayerPerceptronClassifierExample")
      .getOrCreate()

    // $example on$
    // The data in libsvm format is loaded from the file as a DataFrame
    val data = spark.read.format("libsvm")
      .load("sample_multiclass_classification_data.txt")

    // Data is divided into training and testing
    val splits = data.randomSplit(Array(0.6, 0.4), seed = 1234L)
    val train = splits(0)
    val test = splits(1)

    // The layers of the neural network are specified:
    // The input layer is size 4 (characteristics), two intermediate layers
    // one of size 5 and the other of size 4
    // and 3 output (the classes)
    val layers = Array[Int](4, 5, 4, 3)

    // Training parameters are established
    val trainer = new MultilayerPerceptronClassifier()
      .setLayers(layers)
      .setBlockSize(128)
      .setSeed(1234L)
      .setMaxIter(100)

    // The model is trained
    val model = trainer.fit(train)

    // The precision of the test data is calculated
    val result = model.transform(test)
    val predictionAndLabels = result.select("prediction", "label")
    val evaluator = new MulticlassClassificationEvaluator()
      .setMetricName("accuracy")

    // The model accuracy is printed
    println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
    // $example off$

    spark.stop()
  }
}
```
