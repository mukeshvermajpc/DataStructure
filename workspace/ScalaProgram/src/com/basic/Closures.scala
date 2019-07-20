package com.basic

object Closures {
  val number=10
  val add =(x:Int)=>{
    x+number
  }
  def main(args:Array[String])
  {
    println(add(20))
    println(number)
  }
}