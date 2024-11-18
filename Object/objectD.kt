

object MySingleton{
    val name  = "Akash"
}

data object MyDataSingleton{
    val name  = "Akash"
}


fun main(){
    println(MySingleton.name)

    println(MySingleton)

    println(MyDataSingleton)
}