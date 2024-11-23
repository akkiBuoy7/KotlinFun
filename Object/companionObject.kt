

import Employee
/*
Functions are class levels inside companion objects which makes it easy to create factory methods
 */
class User(val name:String){

    companion object Factory {
        fun create(name:String):User{
            return User(name)
        }
    }
}

/*
Companion objects can implement interfaces 
 */

 interface Factory<T>{
    fun create(name:String):T
 }

 class Employee(val name:String){

    companion object : Factory<Employee> {
        override fun create(name:String):Employee = Employee(name)
    }
 }



fun main(){
    val user1 = User.create("Akash")
    println(user1.name)

    val employeeFactory : Factory<Employee> = Employee // uses companion object to directy create a factory
    val employee = employeeFactory.create("Akash")
    println("Factory name : ${employee.name}")
}