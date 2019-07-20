package com.list
object ListExample {
  val lst:List[Int]=List(1,2,3,4,5)
  val names:List[String]=List("Max","Min","Sum","Sub")
  def main(args:Array[String])
  {
    println(0::lst)
    println(names.head)
    println(names.tail)
    println(names.isEmpty)
    println("Reverse list of string")
    println(names.reverse)
    lst.foreach(println)
    var sum:Int=0
    lst.foreach(sum+=_)
    println("Sum of list is:"+lst)
    
  }
}