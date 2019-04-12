package com.obj
class MethodOverLoadTwo {
     def add(a:Int,b:Int):Int={
       a+b
     }
     def add(a:Double,b:Double):Double={
       a+b
     }
}
object MethodOverLoadTwo1{
  def main(args:Array[String])
  {
    var obj=new MethodOverLoadTwo()
    println(obj.add(12, 23))
    println(obj.add(12.0, 23.0))
  }
}