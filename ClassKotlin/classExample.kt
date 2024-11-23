/*
primary constructor -> 
can initialize variable directly
but does not have body so can not use logic inside it

secondary constructor ->
has to call primary constructor always thus initialize variable
called after init block
can not use val or var (similar to function declaration)
*/

/*
init bloc ->
 is called right after primary constructor
 can be used to write logic to initialize variable

 */


class Person(val _name:String,var age:Int = 32, var _designation:String, var _level:String){

    var designation :String

    init{
       this.designation = _designation + "-" + _level

       println("init bloc $_name  $age $designation")

    }
    // calling primary constructor
    constructor(name: String) : this(name, 32, "Guest", "Entry"){
        println("constructor $_name  $age $designation")
    }
    // calling secondary constructor
    constructor(name: String,age: Int) : this(name){
        println("constructor 2 $_name  $age $designation")
    }


}





fun main(){
    val person1 = Person(_name = "John",  _designation = "Developer", _level = "Senior")

    // will call init bloc first and then secondary constructor
    val person2 = Person( "Saha")
    // will call init bloc first, then secondary constructor, then third constructor
    val person3 = Person( "Saha",29)

}