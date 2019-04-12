package com.obj
class Vehicle {
  val speed:Int=60
  def run()
  {
    println("vehicle is running")
  }
}
class Bike extends Vehicle
{
  override val speed:Int=100
 override  def run()
   {
     println("Bike is running")
   }
  def show()
  {
    println("Speed is: "+speed)
  }
}
object methodOverride{
  def main(args:Array[String])
  {
    var obj=new Bike()
    obj.run()
    obj.show()
  }
}