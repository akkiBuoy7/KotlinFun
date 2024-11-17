/*
Interfaces can have concrete methods also
Multiple interfaces can be implemented
overriding can be done both in primary constructor or within body
 */

interface LivingBeing{
    fun breathes()
    fun commonMethod(){
        println("calling Living being")
    }
}

interface Animal {
    fun details()
    val name : String
    // interface can have concrete method
    fun habitat(){
        println("$name lives in jungle")
    }

    fun commonMethod(){
        println("calling animal")
    }
}


class Tiger() : Animal{

    override val name:String  = "Tiger"

    override fun details(){
        println("I am a $name")

    }
}
// overriding within primary constructor
class Lion(override var name:String = "Lion") : Animal{
    
    override fun details(){
        println("I am a $name")
    }
}


// implementing multiple interfaces
class Cow():Animal,LivingBeing{

    override val name:String  = "Cow"

    override fun details(){
        println("I am a $name")
    }

    override fun breathes(){
        println("Breathes oxygen")
    }

    override fun commonMethod(){
        super<Animal>.commonMethod()
    }

}

interface ResponseListener{

    fun onSuccess(){
        println("On success received")
    }

    fun onError(){
        println("on error received")
    }
}

class MyView():ResponseListener{
    override fun onSuccess(){
        return super.onSuccess() // calling default implementation
    }

    override fun onError(){
        return super.onError() // calling default implementation
    }
}



fun main(){

    val obj1 = Tiger()
    val obj2 = Lion()
    val obj3 = Cow()

    obj1.details()
    obj2.details()
    obj3.apply{
        details()
        breathes()
    }
    obj2.habitat()


    val view = MyView()
    view.onSuccess()
    view.onError()

    obj3.commonMethod()

}