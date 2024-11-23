data class Person(val name : String)

class Adapter{


    val myList = mutableListOf(Person("Akash"),Person("Saha"),Person("Akki"))


    fun bindingView(action:(Person,Int)->Unit){
        myList.forEachIndexed { index, person ->
            action(person,index) 
        }
    }
}






fun main(){
    val adapter = Adapter()
    adapter.bindingView{person,index ->
        println("index: $index value: ${person.name}")
    }
}