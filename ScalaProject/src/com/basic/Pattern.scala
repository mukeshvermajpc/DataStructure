package com.basic

object Pattern {
    def main(args:Array[String])
    {
      var a=3
      a match{
        case 1 =>println("This is case one")
        case 2 =>println("This is case two")
        case 3=>println("This is case three")
        case _ =>println("This is default case")   
      }
      
    }
}