//1.-Start a simple Spark session.
spark-shell

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

//2.- Upload Netflix Stock CSV file, have Spark infer the data types.
val df = spark.read.option("header","true").option("inferSchema","true").csv("Netflix_2011_2016.csv")
//val df = spark.read.option("header", "true").option("inferSchema","true")csv("C:\Users\beto_\Desktop\BigData\DatosMasivos\Netflix_2011_2016")

//3.- What are the column names?
df.columns

//4.- How is the scheme?
df.printSchema()

//5.- Print the first 5 columns.
df.select($"Date", $"Open",$"High", $"Low",$"Close").show()

//6.- Use describe () to learn about the DataFrame.
df.describe().show()

//7.- Create a new dataframe with a new column called "HV Ratio" which is the
//relationship between the price of the column "High" versus the column "Volume" of
//shares traded for one day. (Hint: It is a column operation).
val df2 = df.withColumn("HV Ratio",df("High")/df("Volume"))

//8.- Which day had the highest peak in the “Close” column?
df.select("Date", "Close").sort(desc("Close")).show(1)


