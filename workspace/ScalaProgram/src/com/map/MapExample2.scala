package com.map

object MapExample2 {
  def main(args:Array[String])
  {
    var map=Map("A"->"Apple","B"->"Ball")
    println(map)
    println(map("A"))
    var newmap=map+("C"->"cat")
    println(newmap)
  }
}