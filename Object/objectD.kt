
/*
Object declarations :
Can declare a singleton manager class with factory functions
 */
object MySingleton{
    val name  = "Akash"
}
// Can use data alongwith object that overrides the toString() and equals() functions
data object MyDataSingleton{
    val name  = "Akash"
}


/*
Object expressions:

 */


fun main(){
    println(MySingleton.name)

    println(MySingleton)

    println(MyDataSingleton) // prints the class name


}