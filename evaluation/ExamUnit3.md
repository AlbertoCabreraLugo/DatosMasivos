# Assessment practice - Unit 3


**Instituto Tecnológico de Tijuana**

Departamento de Ciencias y Computación

Ingeniería en Sistemas Computacionales
 
 [![](https://upload.wikimedia.org/wikipedia/commons/2/2e/ITT.jpg)](https://upload.wikimedia.org/wikipedia/commons/2/2e/ITT.jpg)

**Title:**
Random Forest Classifier

**Subject:**
BDD-1704 SC9A Datos Masivos

**Unit:**
 III

**Professor:**
JOSE CHRISTIAN ROMERO HERNANDEZ


ARREDONDO GOMEZ RAMON ALEJANDRO     15210326

CABRERA LUGO ALBERTO                17210533 

**Group:**
SC9A

**Date:**
Tijuana, Baja California, December 18, 2020. 
</div>

## 1. Import a simple Spark session.
```scala
import org.apache.spark.sql.SparkSession
```
## 2. Use lines of code to minimize errors
```scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
## 3. Create an instance of the Spark session
```scala
val spark = SparkSession.builder.getOrCreate()
```
## 4. Import the Kmeans library for the clustering algorithm.
```scala
import org.apache.spark.ml.clustering.KMeans
```
## 5. Loads the Wholesale Customers Data dataset
```scala
val dataf = spark.read.option("header", "true").option("inferSchema","true")csv("Wholesale_customers_data.csv")
```
## 6. Select the following columns: Fresh, Milk, Grocery, Frozen, Detergents_Paper, Delicassen and call this set feature_data
```scala
val feature_data = dataf.select("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")
feature_data.show
```
