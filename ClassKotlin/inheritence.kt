open class Animal(open val name:String){
open fun details():String  = "I am an $name"
}

class Carnivore(override val name : String):Animal(name){
    override fun details() = "I am a $name"

    fun callSuper():String{
        return "Carnivore says : ${super.details()}"
    }
}


fun main(){
    val animal = Animal("animal")

   println( animal.details()) // will print animal

   val carnivore = Carnivore("tiger")

   println( carnivore.details()) // will print tiger

   println(carnivore.callSuper()) // calling super
}