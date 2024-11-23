class UserPreferences{
    // creating anonymous object
    private fun getPreferences() = object {
        val name  = "Akash"
        val age = 32
    }

    fun printPreferences(){
        val preferences =  getPreferences() 
        // accessing properties of the anonymous object
        println("name :: ${preferences.name}  age :: ${preferences.age}")

    }
}

interface Vehicles {
    fun runsOn()
}


fun main(){
    // encapsulates data
    //using anonymous object 
    val preferences = UserPreferences()
    preferences.printPreferences()

    // directly creating object of an interface
    val vehicles = object : Vehicles{
        override fun runsOn(){
            println("Runs on petrol")
        }
    }

    vehicles.runsOn()

   // creating an anonymous object
    val anon = object{
        fun drivesOn(){
            println("Drives on roads")
        }
    }

    anon.drivesOn()
}