// def isEven(num:Int): Boolean = {
//     return num%2 == 0
// }
// def isEven(num:Int): num%2 == 0
// println(isEven(6))
// println(isEven(3))
// Practice 3, analyse the following code with your own words

//A function is created where in a cycle it will tell us when a number is even or odd Creation of function
def listEvens(list:List[Int]): String ={
    for(n <- list){
        if(n%2==0){
            println(s"$n is even")
        }else{
            println(s"$n is odd")
        }
    }
    return "Done"
}
//Lists named "l" and "l2"
val l = List(1,2,3,4,5,6,7,8)
val l2 = List(4,3,22,55,7,8)
listEvens(l)
listEvens(l2)


//A function is created that determines the resulting number of operations according to our condition
def afortunado(list:List[Int]): Int={
    var res=0 //variable declaration
    for(n <- list){
        if(n==7){
            res = res + 14
        }else{
            res = res + n
        }
    }
    return res
}

val af= List(1,7,7)
println(afortunado(af))

//Function that determines if the first and second variables obtain the same result using iterations
def balance(list:List[Int]): Boolean={
    var primera = 0
    var segunda = 0

    segunda = list.sum

    for(i <- Range(0,list.length)){
        primera = primera + list(i)
        segunda = segunda - list(i)

        if(primera == segunda){
            return true
        }
    }
    return false 
}

val bl = List(3,2,1) //Assignment of function with the values of its list
val bl2 = List(2,3,3,2)//Assignment of function with the values of its list
val bl3 = List(10,30,90)//Assignment of function with the values of its list

balance(bl)//Execute the function with the values we assign in bl
balance(bl2)//Execute the function with the values we assign in bl2
balance(bl3)//Execute the function with the values we assign in bl3

def palindromo(palabra:String):Boolean ={
    return (palabra == palabra.reverse)
}

val palabra = "OSO"//variable declaration
val palabra2 = "ANNA"//variable declaration
val palabra3 = "JUAN"//variable declaration

println(palindromo(palabra))//impression of values
println(palindromo(palabra2))//impression of values
println(palindromo(palabra3))//impression of values