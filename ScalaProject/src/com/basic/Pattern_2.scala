package com.basic

object Pattern_2 {
  def main(args: Array[String]) {
    var result = search("ram")
    print(result)
  }
  def search(a: Any): Any = a match {
    case 1       => "One"
    case "Two"   => "Two"
    case "Hello" => "Hello"
    case _       => "Select Correct Option"
  }
}