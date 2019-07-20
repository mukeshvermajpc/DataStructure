package com.basic
object CurryingExample {
  def add(x:Int,y:Int)=x+y
  def add2(x:Int)=(y:Int)=>x+y
  def main(args:Array[String])
  {
      println(add(20,10))
      println(add2(20)(20))
      val sum=add2(40)
      println(sum(50))
  }
}
