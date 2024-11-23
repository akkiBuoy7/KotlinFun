/*
Abstract class can not be initalised by making object
 */

abstract class Calculator(){
    abstract fun calc(x:Int,y:Int):Int
}

class Multiple:Calculator(){
override fun calc(x:Int,y:Int):Int{
return x*y
}
}

class Add:Calculator(){
    override fun calc(x:Int,y:Int):Int{
    return x+y
}
}

fun main(){
    val obj = Multiple()
    println(obj.calc(3, 6))
    val obj1 = Add()
    println(obj1.calc(9, 5))
}