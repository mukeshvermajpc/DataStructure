package com.basic

object MatchExample {
  def main(args:Array[String])
  {
    val age=18;
      age match{
      case 20=>println("age is "+age)
      case 18=>println("age is "+age)
      case 40=>println("age is "+age)
      case _ =>println("default section")
    }
      val result= age match{
      case 20=>age
      case 18=>age
      case 40=>age
      case _ =>"default"
    }
    println("result= "+result)
    val i=7
    i match{
      case 1 | 3 | 5 | 7 | 9 =>println("odd")
      case 2 | 4 | 6 | 8 | 10 =>println("even")
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}