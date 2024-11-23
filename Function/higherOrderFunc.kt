
class Sample{
    
    fun addTwoNumber(a:Int,b:Int,action:(Int,Int)->Int){

        val result = action(a,b)
        println(result)
    }

    fun addTwoNumberClosure(a:Int,b:Int,action:(Int,Int)->Unit){
        action(a,b)
        
    }

    fun reverseStr(str:String,action:(String)->String){
       val result =  action(str)
       println(result)
    }

    fun multiple(a:Int,b:Int):Int{
        return a*b
    }
    // using a lambda to return a function
    fun returnMultipleFunc():((Int,Int)->Int){
        return ::multiple
    }
}


fun main(){

    val o = Sample()
    o.addTwoNumber(5,7,{x,y-> x+y})
    var myResult:Int = 0
    o.addTwoNumberClosure(5,9, {x,y->myResult = x+y})
    println(myResult)

    o.reverseStr("Akash",{s-> s.reversed()})

    o.reverseStr("Saha",{it.reversed()}) // if lambda takes single param "it" can be used

    o.reverseStr("akki"){it.reversed()} // lambda can be outside func paranthesis 

    val mulF = o.returnMultipleFunc()
    val r = mulF(3,7)
    println(r)
    

}