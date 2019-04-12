package com.abstract_1

 abstract class Bike {
    def run()
}
class Hero extends Bike
{
   def run()
   {
     println("Bike is running")
   }
}
object MainObject{
   def main(args:Array[String])
   {
     var obj=new Hero()
     obj.run()
   }
}