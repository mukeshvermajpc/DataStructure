package com.basic
object FunctionExample {
  object Math{
    def add(x:Int,y:Int):Int={
      x+y
    }
    def square(x:Int):Int={
      x*x
    }
  }
  def add(x: Int, y: Int): Int = {
    x + y
  }
  def sub(x: Int, y: Int): Int = {
    x - y
  }
  def multi(x: Int, y: Int): Int = {
    x * y
  }
  def div(x: Int, y: Int): Int = {
    x / y
  }
  def main(args: Array[String]) {
    println("Functional programming example")
    println(add(45, 15))
    println(sub(45, 15))
    println(multi(45, 15))
    println(div(45, 15))
    println("Math function in scala")
    println(Math.add(10, 12))
    println(Math.square(12))
  }
}