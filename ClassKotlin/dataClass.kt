/*
Must have a val or var param1 in primary const
Prints the value directly instead of memory references
Can extract value directly into variables from object
Provides copy function to change a particular value only of the object
 */


data class Person1(val name:String="Akash",val height :Int = 32)

data class Person2(val age:Int,val name : String = "Akash")

fun main(){
    val obj1 = Person1()
    val obj2 = Person2(32)
    val objC = Person1(height=32)


    println(obj1)
    println(obj2)

    println("Comparing -> ${obj1==objC}")

    val (_name,_age) = obj2  // extracting variable 

    println("$_name : $_age")

    val temp = obj2.copy(age = 33) // changing only age
    println("copy -> $temp")

}