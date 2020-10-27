//Spark session starts
spark-shell
//We import apache to our scala session
import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()
//Load the CSV file to test the dataframes
val df = spark.read.option("header","true").option("inferSchema","true").csv("Netflix_2011_2016.csv")

//Practice with 15 default Spark functions for Dataframes, with the link referring to this topic
//Function 1. Returns all column names as an array.
df columns
//Function 2. Returns true if the Dataset is empty. 
df isEmpty
//Function 3. Returns the schema of this Dataset. 
df schema
//Function 4. Eagerly checkpoint a Dataset and return the new Dataset.
df checkpoint
//Function 5. Creates a global temporary view using the given name.
df createGlobalTempView
//Function 6. Returns all column names and their data types as an array. 
df dtypes
//Function 7. Returns a new Dataset where each record has been mapped on to the specified type
df as
//Function 9. Prints the physical plan to the console for debugging purposes. 
df explain()
//Function 10. Specifies some hint on the current Dataset.  
df hint
//Function 11. Prints the schema to the console in a nice tree format.
df printSchema()
//Function  12. Interface for saving the content of the non-streaming Dataset out into external storage.
df write
//Function  13.Interface for saving the content of the streaming Dataset out into external storage.
df writeStream
//Function  14. Get the Dataset's current storage level, or StorageLevel.NONE if not persisted. 
df storageLevel
//Function 15. Prints the physical plan to the console for debugging purposes. 
df persist()