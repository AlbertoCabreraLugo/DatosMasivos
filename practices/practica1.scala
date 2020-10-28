// 1. Develop a scala algorithm that calculates the radius of a circle
     // We need to know the Perimeter (P) to be able to get the radio, I assigned a number 17.2788, you can put whatever you want.
    val P = 17.2788
    val R = P/6.28

// 2. Develop an algorithm in scala that tells me if a number is prime

def isPrime(num:Int): Boolean = {
    for(n <- Range(2, num)){
        if(num%n == 0){
            return false
        }
    }
    return true
}

//The number 10 is just an example, it can be substituted for any number and it will verify that it is a prime number.
println(isPrime(10))

//3. Given the variable bird = "tweet", use string interpolation to
//   print "Estoy ecribiendo un tweet"

val x = "Estoy escribiendo un tweet"
val bird = "tweet"

if(bird == "tweet"){
    println(s"$x")
}

//4. Given the variable message = "Hello Luke, I am your father!" use slice to extract the
//   sequence "Luke"
val saludo = ("Hola Luke yo soy tu padre!")
saludo slice (5,9)

//5. What is the difference between value and a variable in scala
//That the variable is mutable and in scala it is not mutable generates an error

//6. Given the tuple (2,4,5,1,2,3,3.1416,23) return the number 3.1416 
val tuplaPi = (2,4,5,1,2,3,3.1416,23)
println(tuplaPi._7)


