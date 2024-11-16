
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

fun main(){
    val rev  =  "Akash".reverseF()
    println("$rev")
    println(5.isGreaterThan(3))
}