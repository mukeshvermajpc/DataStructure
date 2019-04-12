package com.obj

class MethodOverload {
  def add(a:Int,b:Int):Int={
    a+b
  }
  def add(a:Int,b:Int,c:Int):Int={
    a+b+c
  }
}
object MethodOverload1
{
    def main(args:Array[String])
    {
      var c=new MethodOverload()
      println("Sum of two number is "+c.add(10, 20))
      println("Sum of three number "+c.add(23, 34, 45))
    }
}