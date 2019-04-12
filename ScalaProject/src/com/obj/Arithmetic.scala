package com.obj

class Arithmetic {
  def add(a:Int,b:Int)
  {
    var add=a+b
    println("Sum: "+add)
  }
}
object MainObject1{
  def main(args:Array[String])
  {
    new Arithmetic().add(123, 234)
  }
}
