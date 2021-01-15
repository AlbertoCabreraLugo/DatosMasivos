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
- Introduction
- Theoretical framework
- Implementation
- Results
- Conclusions
- References


# Introduction
Algorithms and the classification of things is something that has been since the beginning of technological times, as the years go by, technologies evolve but 
We continue to handle algorithms and classifiers but this time with more advanced statistical learning and thanks to machine learning this helps the algorithms to 
form more information as we store them, they learn more and the precision with which they classify things is more exact. For this there are different classification 
algorithms and in this project they will be compared four different algorithms to see how each one behaves.

# Result
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
    
## Decision Three
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
Decision Three       | Average   | 381,6      |  389,3      |   735,2     | 910        | 0,899351460700000 | 0,1006485393 |
Logistic Regression  | Average   | 344,5000   |  360,7000   |   718,0000  | 910        | 0,8901            | 0,1121       |
Multilayer perceptron| Average   | 253,1000   |  345,6000   |   587,4000  | 910        | 0,8808            | 0,1192       |
