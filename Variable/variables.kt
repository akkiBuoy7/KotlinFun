fun main(){
   var name : String?  = null
   name?.let { it->
    println("length of the name is ${name.length}") // this will never print as name is null
    println("length of the it is ${it.length}") // this will never print as name is null
    }

    val name1 : String? = "Akash"
   val l  = name1?.length?:"unknown"

   val name2 : String? = null
   val l2  = name2?.length?:"unknown" // since null so will print "unknown"

   println(l)
   println(l2)

  // null assertion

 // val name3 :String? = null

  //println("length of name is ${name3!!.length}") // it will throw exception

  print(MyVariableClass.fileName)

}

class MyVariableClass{

    /*
    const variable is immutable i.e its value can not be changed
    const is top member variabl i.e can not be declared inside class which will make it runtime
    const can be declared inside companion object or object 
    const gets inlined during compilation at the palce where it is used so reduces overhead
    Since const variable is immutable so we can not use var we have to use val as it can not be changed
     */

    companion object{
        const val FILE_EXTENSION = ".png"
        val fileName : String
        get() = "Img_ ${FILE_EXTENSION} ${"Akash"}" 
    }
}