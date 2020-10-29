
//Algorithm 1 Descending recursive version
def fib1( n : Int) : Int = n match {
   case 0 | 1 => n
   case _ => fib1( n-1 ) + fib1( n-2 )
}


//2 Algorithm 2 Version with explicit formula 
def fib2 (n:Int): Double = {
  if(n<2){
    return n
  }
  else {
    return ((1/math.sqrt(5))* math.pow(((1+math.sqrt(5))/2),n)+(1/2))
  }
}

//Algorithm 3 Iterative version
def fib3( n : Int ) : Int = {
  var a = 0
  var b = 1
  var c = 0	  

  while( i < n ) {
    val c = a + b
    a = b
    b = c
    i = i + 1
  } 
  return a
}

//Printing of values to confirm algorithm
val f1 = fib1(n=7)
println(f1)

val f2 = fib2(7)
println(f2)

val f3 = fib3(7)
println(f3)

//4 Algorithm 4 Iterative version, 2 variables
def fib4(n:Int) : Int = { 
    var a = 0 
    var b = 1 

    for(i <- 1 to n)
    { 
        b = b + a 
        a = b - a 
    }
    return a
}

//5 Algorithm 5 Iterative vector version
def fib5(n:Int) : Int = {
    var vector = new Array[Int](n+2)
    if(n<2){
        return n
    }
    else{
        for(i <- 1 to n+1){
            vector(i) = i
        }

        for(i <- 2 to n){
            vector(i) = vector(i-1) + vector(i-2)
        }
        return vector(n)
    }
}

//Printing of values to confirm algorithm

val f1 = fib1(n=7)
println(f1)

val f2 = fib2(7)
println(f2)


val f3 = fib3(7)
println(f3)

val f4 = fib4(7)
println(f4)
 
val f5 = fib5(7)
println(f5)

