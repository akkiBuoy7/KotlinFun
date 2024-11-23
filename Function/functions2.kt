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

// extension function with parameter
fun Int.isGreaterThan(num:Int) :Boolean = this > num


/*
infix with operator
 */
class Header(val name:String)

infix operator fun Header.plus(other:Header):Header{
return Header(this.name+other.name)
}



fun main(){
    val rev  =  "Akash".reverseF()
    println("$rev")
    println(5.isGreaterThan(3))

    val h1 = Header("AKASH ")
    val h2 = Header("SAHA")

    val result = h1 plus h2 // without using "." as infix used

    val result2 = h1 + h2  // using + as operator used

    println(result.name)

    println(result2.name)
}