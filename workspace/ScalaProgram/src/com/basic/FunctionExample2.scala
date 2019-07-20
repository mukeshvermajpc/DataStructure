package com.basic
object FunctionExample2{
  object Math{
    def +(x:Int,y:Int):Int={x+y}
    def **(x:Int)=x*x
    
  }
  def main(args:Array[String])
  {
    println(Math.+(13,30))
    println(Math.**(12))
    var add=(x:Int,y:Int)=>x+y;
    println("Anonymous function:")
    println(add(10,20))
    
  }
}