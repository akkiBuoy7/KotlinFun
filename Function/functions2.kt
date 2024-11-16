/*
Extension Function -> "This" refers to current variable context
 */
fun String.reverseF():String{

    if(this.length==1){
      return this
    }

    var result :StringBuilder = StringBuilder()
    val temp = this.split("")

    for(i in temp.indices.reversed()){

        result.append(temp[i])
    }
    return result.toString().lowercase()
}

fun Int.isGreaterThan(num:Int) :Boolean = this > num

class Header(val name:String)

infix fun Header.plus(other:Header):Header{
return Header(this.name+other.name)
}

fun main(){
    val rev  =  "Akash".reverseF()
    println("$rev")
    println(5.isGreaterThan(3))

    val h1 = Header("AKASH ")
    val h2 = Header("SAHA")

    val result = h1 plus h2

    println(result.name)
}