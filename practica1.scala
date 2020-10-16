//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo
    //Ocupamos conocer el Perimetro(P) para poder sacar el radio, yo le asigne un numero 17.2788, puedes poner lo que quieras.
    val P = 17.2788
    val R = P/6.28

//2. Desarrollar un algoritmo en scala que me diga si un numero es primo

def isPrime(num:Int): Boolean = {
    for(n <- Range(2, num)){
        if(num%n == 0){
            return false
        }
    }
    return true
}

//El numero 10 es solo un ejemplo, se puede sustituir por cualquier numero y verificara que sea numero primo.
println(isPrime(10))

//3. Dada la variable bird = "tweet", utiliza interpolacion de string para
//   imprimir "Estoy ecribiendo un tweet"

val x = "Estoy escribiendo un tweet"
val bird = "tweet"

if(bird == "tweet"){
    println(s"$x")
}

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slice para extraer la
//   secuencia "Luke"
val saludo = ("Hola Luke yo soy tu padre!")
saludo slice (5,9)

//5. Cual es la diferencia entre value y una variable en scala
//Que la variable es mutable y en scala no es mutable te genera un error

//6. Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el numero 3.1416 
val tuplaPi = (2,4,5,1,2,3,3.1416,23)
println(tuplaPi._7)


