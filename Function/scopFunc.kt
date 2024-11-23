
/*
let || it || lambda result || is extension func
run || this || lambda result || is/not extension func
with || this || lambda result || not extension func (takes context obj as arg)

apply || this || context object || is extension func
also || it || context object || is extension func
*/

class ScopeClass{
    var name:String = "Akash"
}

class Human{
    var name = "Akash"
    var phNumber = "1223908987"
    var address = "hfgjhfvbdhvb"

    fun display() :String = "Human details are name : $name phNumber : $phNumber address : $address"
}


fun main(){

    /*
    let =>
    "it" keyword can be renamed
    provides null check
    easy to perform operation on the result of a call chain
    Uses:
    Executing a lambda on non null objects
    Introducing an expression as a variable in local scope
     */

     val obj = ScopeClass()

     obj.let{ details ->
        println("name is ${details.name}")
    }

    //  var name : String?  = null
    //  name?.let { it->
    //   println("length of the name is ${name.length}") // this will never print as name is null
    //   println("length of the it is ${it.length}") // this will never print as name is null
    //   }
    
      val numbers = mutableListOf("one" , "two" , "three" , "four" , "five")

      numbers.map{ it.length}.filter{it >3}.let{println(it)}


      /*
      it uses"this" keyword
      
      Uses:
      Object configuration and computing the result 
      Running statements where an expression is required
       */

       val details = Human().run{
        name = "Akash Saha"
        " ${display()}"
       }

       println(details)

       /*
       with =>

       Uses:
       Grouping function calls on an object
        */

        val human :Human?  = Human()

       val  d = with(human){
            this?.name = "Saha"
            this?.phNumber = "445354367613"

            this?.display()
        }

        println(d)

        // with vs run
       // on nullable objects use run makes the code cleaner.
        val d1 = human?.run{
            name = "Akki"
            phNumber = "6454353"
            display()
        }
        println(d1)


        /*
        apply =>
         provides null check
         Uses:
         Object configuration
         */

        Human().apply{
            name  = "Hello"
            address = "sjkffnjf jsdja sjdasjj "
         }.let{
            println(it.display())
         }


         /*
         also =>

         Uses:
         Additional effects
          */
        
        Human().apply{
            name  = "Hello"
            address = "sjkffnjf jsdja sjdasjj "
         }.also{it->
            // additional assignment based on a condition
            if (!it.name.isNullOrEmpty()) {
                it.phNumber = "54404 484 646546" }
            
         }.let{ it ->
            println(it.display())
         }


}