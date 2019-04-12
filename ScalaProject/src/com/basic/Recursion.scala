package com.basic

object Recursion {
  def main(args: Array[String]) {
    var add = (a: Int, b: Int) => a + b
    var sub = (a: Int, b: Int) => a - b
    var multi = (a: Int, b: Int) => a * b
    var div = (a: Int, b: Int) => a / b
    println("Factorial 10 is: " + recur(6))
    println("Function Example: " + functionExample(15, 3))
    println("Function with default value " + functionDefault(13, 23))
    println("Function with default value " + functionDefault())
    println("Lambda Add function "+add(12,23))
    println("Lambda Sub function "+sub(23,10))
    println("Lambda Multiplication function "+multi(10,20))
    println("Lambda Division function "+div(120,5))
  }
  def recur(a: Int): Int = {
    var sum: Int = 1
    if (a >= 1)
      a * recur(a - 1)
    else
      1
  }
  def functionExample(a: Int, b: Int): Int =
    {
      if (b == 0)
        0
      else
        a + functionExample(a, b - 1)
    }
  def functionDefault(a: Int = 0, b: Int = 0): Int = {
    a + b
  }
}