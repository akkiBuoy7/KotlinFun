

 fun main(){
    // if block
    /*
    If loop can be used directly as expresion
    In if loop the last statement of the block is returned implicitely
     */

     val a = 20
     val b = 30

        // val maxValue = if(a>b){
        //     b
        // }else{
        //     a
        // }

       // println("max value is ${maxValue}")


     /*
     For loop
      */   

      for(i in 1..10){
       // print(i)
      }
      println()
      for(i in 1.rangeTo(10)){
       // print(i)
      }
      println()
      for(i in 10.downTo(1)){
       // print(i)
      }
      println()
      for(i in 1 until(10) step(2)){
        //print(i)
      }

      println()

      /*
      forEach is used to perform action on each and every elemnt of list
       */

       val l = listOf("A","B","C","D")
       l.forEach{
        //print(it)
       }

    /*
    labelled for loop
     */   
    // continue for outer loop
     outer@for(i in 1..3){
        for(j in 1..3){
            if(i==2 && j==2){
                continue@outer  // full iteration of 2 after 2-1 will be skipped (outer loop continue)
            }
            //println(" $i - $j ")
        }
        
     }

     println()

     // continue for inner loop
     outer@for(i in 1..3){
        inner@for(j in 1..3){
            if(i==2 && j==2){
                continue@inner  // only 2-2 will be skipped (inner loop continue)
            }
            //println(" $i - $j ")
        }
        
     }

    println()


     outer@for(i in 1..3){
        inner@for(j in 1..3){
            if(i==2 && j==2){
                break@outer  // After 2-1 iteration of all will be skipped (outer loop break)
            }
          // println(" $i - $j ")
        }
        
     }

     println()

     outer@for(i in 1..3){
       inner@for(j in 1..3){
            if(i==2 && j==2){
                break@inner  // After 2-1 iteration of 2 will be skipped (inner loop break)
            }
          // println(" $i - $j ")
        }
        
     }

  
     /*
     When Loop
      */

      // for a variable
      val number = 7
      val result = when(number){
        1 -> "It is one"
        2-> "It is two"
        7-> "It is seven"
        else-> "Unknown"
      }

      println("Variable -> $result")

      // similar to if else
      val number1 = 3
      when{
        number1<5 -> println("less than 5")
        number1>5 -> println("greater than 5")
      }

      // using range operator as condition

      val number2 = 50

      when(number2){
        in 1..10 -> println("less than 10")
        in 10..40 -> println("less than 40")
        in 40..51 -> println("more than 40")
      }

      // Any type
    val obj : Any = 7
      when(obj){
        is Int -> println("It is int")
        is String -> println("It is string")
      }

     
}

