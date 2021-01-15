# Final Project - Unit 4


**Instituto Tecnológico de Tijuana**

Departamento de Ciencias y Computación

Ingeniería en Sistemas Computacionales
 
 [![](https://upload.wikimedia.org/wikipedia/commons/2/2e/ITT.jpg)](https://upload.wikimedia.org/wikipedia/commons/2/2e/ITT.jpg)

**Title:**
Final Project

**Subject:**
BDD-1704 SC9A Datos Masivos

**Unit:**
 IV

**Professor:**
JOSE CHRISTIAN ROMERO HERNANDEZ


ARREDONDO GOMEZ RAMON ALEJANDRO     15210326

CABRERA LUGO ALBERTO                17210533 

**Group:**
SC9A

**Date:**
Tijuana, Baja California, January 15, 2021. 
</div>

# Index

## [1.- Introduction](#Introduction)
## [2.- Theoretical framework](#TheoreticalFramework)
   #### [SVM](#SVM)
   #### [Decision Tree](#DecisionTree)
   #### [Logistic Regression](#LogisticRegression)
   #### [Multilayer Perceptron](#MultilayerPerceptron)
## [3.- Implementation](#Implementation)
## [4.- Results](#Results)
## [5.- Conclusion](#Conclusion)
## [6.- References](#References)


# 1.- Introduction <a name="Introduction"></a>
Algorithms and the classification of things is something that has been since the beginning of technological times, as the years go by, technologies evolve but 
We continue to handle algorithms and classifiers but this time with more advanced statistical learning and thanks to machine learning this helps the algorithms to 
form more information as we store them, they learn more and the precision with which they classify things is more exact. For this there are different classification 
algorithms and in this project they will be compared four different algorithms to see how each one behaves.

# 2.- Theoretical framework <a name="TheoreticalFramework"></a>

## SVM <a name="SVM"></a>
The Support Vector Machines (SVM) are a set of supervised learning algorithms developed by VladimirVapnik. The objective of the classification problems that apply this type of supervised learning algorithms is the following; Given a training set with its class labels, train an SVM to build a model that predicts the class of a new sample or set of tests. SVMs are one of the most powerful techniques in machine learning. It consists of building a hyperplane in a space of very high dimensionality (or even infinite) that separates the classes we have. A good separation between the classes will allow a correct classification of the new sample, that is, we need to find the maximum separation to the points closest to this hyperplane.

![alt text](https://static.javatpoint.com/tutorial/machine-learning/images/support-vector-machine-algorithm.png)

### The advantages of the Support Vector Machines are:

- Effective in large spaces.
- Still effective in cases where the number of dimensions is greater than the number of samples.
- It uses a subset of training points in the decision function (called support vectors), so it is also memory efficient.
- Versatile - Different kernel functions can be specified for the decision function. Common kernels are provided, but custom kernels can also be specified.

### Disadvantages of support vector machines include:

- If the number of features is much greater than the number of samples, avoid over-tuning when choosing the kernel functions and the regularization term is crucial.
- SVMs do not directly provide probability estimates, these are calculated using a five-fold cross-validation (see Scores and probabilities, below)

## Decision Tree <a name="DecisionTree"></a>

A decision tree is a prediction model whose main objective is inductive learning from observations and logical constructions. They are very similar to rule-based prediction systems, which serve to represent and categorize a series of conditions that occur successively for the solution of a problem. They are probably the most widely used and popular classification model. The knowledge obtained during the inductive learning process is represented by a tree. A tree is graphically represented by a set of nodes, leaves, and branches. The main or root node is the attribute from which the classification process starts; the inner nodes correspond to each of the questions about the particular attribute of the problem. Each possible answer to the questions is represented by a child node. The branches that come out of each of these nodes are labeled with the possible values ​​of attribute 2. The final nodes or leaf nodes correspond to a decision, which coincides with one of the class variables of the problem to be solved. This model is built from the narrative description of a problem, since it provides a graphic vision of decision making, specifying the variables that are evaluated, the actions that must be taken and the order in which the decision making will be carried out. Each time this type of model is executed, only one path will be followed depending on the current value of the evaluated variable. The values that the variables can take for this type of model can be discrete or continuous.

![alt text](https://miro.medium.com/max/2298/1*TlTzgt8I_5dUSbMZmRKyqQ.jpeg)

A decision tree is a prediction model whose main objective is inductive learning from observations and logical constructions. They are very similar to the systems of A decision tree generation algorithm consists of 2 stages: the first corresponds to the induction of the tree and the second to the classification. In the first stage, the decision tree is built from the training set; Usually each internal node of the tree is made up of a test attribute and the portion of the training set present in the node is divided according to the values that this attribute can take. Building the tree begins by generating its root node, choosing a test attribute, and dividing the training set into two or more subsets; a new node is generated for each partition and so on. When there are objects of more than one class in a node, an internal node is generated; when it contains objects of only one class, a sheet is formed that is assigned the label of the class. In the second stage of the algorithm each new object is classified by the built tree; then the tree is traversed from the root node to a leaf, from which the membership of the object to some class is determined. The path to follow in the tree is determined by the decisions made at each internal node, according to the test attribute present in it.

## Logistic Regression <a name="LogisticRegression"></a>
### What is linear regression?
Linear regression is a supervised learning algorithm used in machine learning and statistics. In its simplest version, what we will do is “draw a line” that will indicate the trend of a set of continuous data (if they were discrete, we would use Logistic Regression).

In statistics, linear regression is an approximation to model the relationship between a dependent scalar variable "y" and one or more explanatory variables named "X".

### How does the linear regression algorithm work?
Let us remember that Supervised Machine Learning algorithms learn by themselves and -in this case- to automatically obtain that "line" that we are looking for with the prediction trend. To do this, the error is measured with respect to the input points and the actual output “Y” value. The algorithm should minimize the cost of a quadratic error function and those coefficients will correspond to the optimal line. There are several methods to minimize the cost. The most common is to use a vector version and the so-called Normal Equation that will give us a direct result.

![alt text](https://content.gnoss.ws/imagenes/Usuarios/ImagenesCKEditor/c513da9b-6419-42be-82ef-3c448a0b5a79/36c7bc05-5bc1-4266-9e1e-ee5f6ba6c312.png)

## Multilayer perceptron <a name="MultilayerPerceptron"></a>
### Artificial neuron
When we talk about neuronal systems, it is important to define the concept of artificial neurons, a basic element of this type of systems, whose description is inherited from the neuro-biological principles that describe the behavior of neurons in the cerebral cortex. The artificial neuron consists of input and output elements that are processed in the central unit, as well as the processing elements that will allow the neuron to generalize and learn concepts.

From the model of the artificial neuron Rosenblatt (1958,1962) developed the Perceptron model which basically consists of a layer of neurons with adjustable weights and thresholds as shown in, this neural system can be called a neural network due to the existing connections in its elements.
It was Rosenblatt himself who, based on the learning model of the delta rule, raised above, determined the Perceptron training algorithm that, following the principles of the rule, consists of determining the adjustment to be made to each weight ω in the neuron so that the error at the output is zero. The Perceptron training algorithm begins by initializing the free parameters (weights and thresholds) at zero and subsequently the network is stimulated with some input vector, obtaining the error at each output

The Multilayer Perceptron has the objective of categorizing or classifying data in a supervised way, being one of the most used networks for classification. (Couchman, 2003) For the present study this network applied to binary classification has been used. Using the Backpropagation supervised learning algorithm, the network learns the relationship between the input examples, grid pressure values, and their corresponding class, defined by whether or not it produced coastal flooding (training phase), to then be able to categorize a Example of entry from which its exit is unknown (learning phase).

![alt text](https://www.researchgate.net/publication/259319882/figure/fig3/AS:667043535810572@1536046980868/Structure-of-a-typical-3-layer-feed-forward-multilayer-perceptron-artificial-neural.png)

# 3.- Implementation <a name="Implementation"></a>
## What is Spark?
Spark is an open source platform widely used in the industry for the processing of large volumes of data and execution of intensive computation on them. A framework that offers great value transforming and analyzing relevant data that helps large companies make better business decisions.

This platform contains modules and libraries to better work with the data to be processed. In addition, Spark is multilanguage so it can be programmed in Scala, Python, Java or R.

## Why use Spark?
Apache Spark es un framework de procesamiento de datos distribuidos diseñado para ser rápido, y se clasifica como de propósito general. Consta de diferentes APIs y módulos que permiten que sea utilizado por una gran variedad de profesionales en todas las etapas del ciclo de vida del dato.

## Why code in Spark with Scala?
Scalable language (Scala), is a hybrid language between object-oriented programming and functional programming. Therefore, having the advantages of one and the other, it is a quite functional and practical language.

It has less code to perform some functions compared to other languages. This is useful because you can reduce your code to a minimum and thus read it faster to correct potential problems.

In addition, it is compatible with the Java virtual machine, this means that you can reuse Java libraries in your Scala applications, you will have compatibility with Java code and you can benefit from a consolidated community in the programming scene.

![alt text](https://bigdata-madesimple.com/wp-content/uploads/2018/12/Scala-Spark.jpg)


# 4.- Results <a name="Results"></a>
## SVM Test
| Run       | UsedMemory | Free memory | Total memory| Max Memory | Accuracy          | Error        |  
| :--------:| :------:   | :---------: |:---------:  | :------:   | :---------------: | -----------: |
| 1         | 427        |  318        |   758       | 910        | 0,876561258796345 | 0,1234387412 |
| 2         | 413        |  333        |   759       | 910        | 0,892304523245214 | 0,1076954768 |
| 3         | 354        |  392        |   759       | 910        | 0,882737896427812 | 0,1172621036 |
| 4         | 282        |  458        |   753       | 910        | 0,876561654789321 | 0,1234383452 |
| 5         | 216        |  530        |   759       | 910        | 0,890253261703762 | 0,1097467383 |
| 6         | 477        |  269        |   759       | 910        | 0,887688984881209 | 0,1123110151 |
| 7         | 398        |  348        |   759       | 910        | 0,884935654806964 | 0,1150643452 |
| 8         | 327        |  420        |   759       | 910        | 0,876561258796345 | 0,1203562035 |
| 9         | 276        |  464        |   752       | 910        | 0,879643796481236 | 0,1154970760 |
| 10        | 557        |  512        |   759       | 910        | 0,887673245798123 | 0,1123267542 |
| Average   | 372.7000   |  404.4000   |   757.6000  | 910        | 0,884286320100000 | 0,1157136799 |
    
## Decision Tree
| Run       | UsedMemory | Free memory | Total memory| Max Memory | Accuracy          | Error        |  
| :--------:| :------:   | :---------: |:---------:  | :------:   | :---------------: | -----------: |
| 1         | 212        |  499        |   714       | 910        | 0,891245789652369 | 0,1087542103 |
| 2         | 285        |  425        |   725       | 910        | 0,892307692307692 | 0,1076923077 |
| 3         | 331        |  374        |   720       | 910        | 0,901245786145879 | 0,0987542138 |
| 4         | 219        |  506        |   739       | 910        | 0,901245785467983 | 0,0987542145 |
| 5         | 320        |  402        |   737       | 910        | 0,901245145783523 | 0,0987548542 |
| 6         | 440        |  288        |   742       | 910        | 0,901245714578967 | 0,0987542854 |
| 7         | 390        |  343        |   747       | 910        | 0,901241478158753 | 0,0987585218 |
| 8         | 344        |  374        |   742       | 910        | 0,901245714574158 | 0,0987542854 |
| 9         | 395        |  332        |   741       | 910        | 0,901245714578965 | 0,0987542854 |
| 10        | 380        |  350        |   745       | 910        | 0,901245786145879 | 0,0987542138 |
| Average   | 381,6      |  389,3      |   735,2     | 910        | 0,899351460700000 | 0,1006485393 |

## Logistic Regression
| Run       | UsedMemory | Free memory | Total memory| Max Memory | Accuracy          | Error        |  
| :--------:| :------:   | :---------: |:---------:  | :------:   | :---------------: | -----------: |
| 1         | 200        |  441        |   654       | 910        | 0,890141049876399 | 0,1141185076 |
| 2         | 302        |  369        |   685       | 910        | 0,890141049876396 | 0,1126025354 |
| 3         | 245        |  444        |   702       | 910        | 0,890141049876396 | 0,1130369253 |
| 4         | 328        |  378        |   719       | 910        | 0,890141049876396 | 0,1155589123 |
| 5         | 456        |  259        |   728       | 910        | 0,890141049887496 | 0,1129943503 |
| 6         | 457        |  267        |   736       | 910        | 0,890141049887499 | 0,1005747126 |
| 7         | 428        |  298        |   738       | 910        | 0,890141049887499 | 0,1062079282 |
| 8         | 335        |  393        |   741       | 910        | 0,890141049887499 | 0,1220196353 |
| 9         | 227        |  499        |   738       | 910        | 0,890141049887499 | 0,1231563422 |
| 10        | 467        |  259        |   739       | 910        | 0,890141049887499 | 0,1008645533 |
| Average   | 344,5000   |  360,7000   |   718,0000  | 910        | 0,8901            | 0,1121       |

## Multilayer Perceptron
| Run       | UsedMemory | Free memory | Total memory| Max Memory | Accuracy          | Error        |  
| :--------:| :------:   | :---------: |:---------:  | :------:   | :---------------: | -----------: |
| 1         | 256        |  287        |   553       | 910        | 0,885463217854693 | 0,1145367821 |
| 2         | 158        |  434        |   601       | 910        | 0,874589632145871 | 0,1254103679 |
| 3         | 294        |  294        |   601       | 910        | 0,871245789632145 | 0,1287542104 |
| 4         | 201        |  345        |   556       | 910        | 0,879874569874564 | 0,1201254301 |
| 5         | 332        |  211        |   556       | 910        | 0,889652897412589 | 0,1103471026 |
| 6         | 234        |  368        |   601       | 910        | 0,871457896541235 | 0,1285421035 |
| 7         | 361        |  456        |   600       | 910        | 0,889745698737946 | 0,1102543013 |
| 8         | 257        |  328        |   600       | 910        | 0,877945863278947 | 0,1220541367 |
| 9         | 164        |  439        |   603       | 910        | 0,889647519735468 | 0,1103524803 |
| 10        | 284        |  304        |   603       | 910        | 0,878796314789654 | 0,1103524803 |
| Average   | 253,1000   |  345,6000   |   587,4000  | 910        | 0,8808            | 0,1192       |

## Algorithm comparison
| Algorithm          | Average   | UsedMemory | Free memory | Total memory| Max Memory | Accuracy          | Error        | 
| :---------------:  | :------:  | :---------:|:---------:  | :------:    | :---------:| ----------------: |------------: |
SVM                  | Average   | 372,7000   |  404,4000   |   757,6000  | 910        | 0,884286320100000 | 0,1157136799 |
Decision Tree        | Average   | 381,6      |  389,3      |   735,2     | 910        | 0,899351460700000 | 0,1006485393 |
Logistic Regression  | Average   | 344,5000   |  360,7000   |   718,0000  | 910        | 0,8901            | 0,1121       |
Multilayer perceptron| Average   | 253,1000   |  345,6000   |   587,4000  | 910        | 0,8808            | 0,1192       |

# 5.- Conclusion <a name="Conclusion"></a>
When visualizing the comparisons that were made to the algorithms, we think that the results are very similar and that it is better to use the algorithm with which you are most familiar. In the same way, each algorithm can work better according to the situation that arises. But this practice served to see which is more accurate, what is its margin of error, among other things

# 6.- References <a name="References"></a>
- Marketing KeepCoding. (2020, 15 julio). ¿Cómo usar Spark con Scala para Big Data? KeepCoding. https://keepcoding.io/blog/usar-spark-con-scala/
- Gala García, Y. (2013). Algoritmos SVM para problemas sobre big data (Master's thesis). https://repositorio.uam.es/bitstream/handle/10486/14108/66152_Yvonne_Gala_Garcia.pdf?s
- Fernandez, R. (2019, 5 septiembre). Support Vector Machines (SVM). ▷ Cursos de Programación de 0 a Experto © Garantizados. https://unipython.com/support-vector-machines-svm/
- Martínez, R. E. B., Ramírez, N. C., Mesa, H. G. A., Suárez, I. R., Trejo, M. D. C. G., León, P. P., & Morales, S. L. B. (2009). Árboles de decisión como herramienta en el diagnóstico médico. Revista médica de la Universidad Veracruzana, 9(2), 19-24.
- N. (2020, 19 diciembre). Regresión Lineal en español con Python. Aprende Machine Learning. https://www.aprendemachinelearning.com/regresion-lineal-en-espanol-con-python/#more-5722
