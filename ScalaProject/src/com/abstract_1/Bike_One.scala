package com.abstract_1

abstract class Bike_One(a:Int) {
  var b:Int=20
  var c:Int=25
  def run()
  def performanace()
  {
    println("Performance is awesome")
  }
}
class Hero1(a:Int)extends Bike_One(a)
{
    c=30
    def run()
    {
      println("Running fine")
      println("a = "+a)
      println("b = "+b)
      println("c = "+c)
    }
}
object HeroObject
{
   def main(args:Array[String])
   {
     var obj=new Hero1(10)
     obj.run()
     obj.performanace()
   }
}