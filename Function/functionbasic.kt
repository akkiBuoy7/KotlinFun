// default param2
fun function1(param1:String,param2:String = "Saha"){

    println("$param1 $param2")
}

fun mul(num1:Int,num2:Int = 7):Int{
    return num1*num2
}
// expression function
fun isEven(num : Int) : Boolean = num%2 == 0

fun function2(num1:Int){
    /*
    function param is always of val type implicitely
    So reassign not possible
    need to reassign variable to use it within function
     */

     var result = num1
     result+=100

     println("result is $result")

}

fun varagFunc(vararg nums:Int){
     var result = 0
    for(i in nums){
        result+=i
    }
    print(result)
}

fun main(){

    function1(param1 = "Akash")

    println(mul(num1 = 2))

    println("is Even -> ${isEven(7)}")

    function2(num1=50)

   // val varargParam = 1,2,3
    varagFunc(1,2,3)

}