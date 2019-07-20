package com.basic

object IfElseExample {
  def main(args: Array[String]) {
    val x = 20
    if (x == 20)
      println("Number is equal to 20")
    else
      println("Number is not equal to 20")
    val res = if (x == 20) "x==20" else "x!=20"
    println(res)
    println(if (x == 20) "x==20" else "x!=20")

  }
}