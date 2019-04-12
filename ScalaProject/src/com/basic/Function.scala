package com.basic

object Function {
  def main(args:Array[String])
  {
    println(withOutArgs())
    println("Return value is: "+ withArgs(120))
    println("Sum of number is: "+withArgs(120,230))
  }
  def withOutArgs():String={
    var a="Welcome in scala function"
    a
  }
  def withArgs(a:Int):Int={
    a
  }
  def withArgs(a:Int,b:Int):Int={
   a+b
  }
}