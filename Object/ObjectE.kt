class UserPreferences{
    private fun getPreferences() = object {
        val name  = "Akash"
        val age = 32
    }

    fun printPreferences(){
        val preferences =  getPreferences() 
        println("name :: ${preferences.name}  age :: ${preferences.age}")

    }
}

interface Vehicles {
    fun runsOn()
}


fun main(){

    val preferences = UserPreferences()
    preferences.printPreferences()


    val vehicles = object : Vehicles{
        override fun runsOn(){
            println("Runs on petrol")
        }
    }

    vehicles.runsOn()


    val anon = object{
        fun drivesOn(){
            println("Drives on roads")
        }
    }

    anon.drivesOn()
}