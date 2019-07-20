package com.map

object mapfilterexample {
  val lst=List(1,2,3,5,7,13)
  val mymap=Map(1->"Tom",2->"Max",3->"Min")
  def main(args:Array[String])
    {
      println(lst.map(x=>x/0.2))
      println("append a string in list")
      println(lst.map(x=>"Hi"*x))
      println("Append a string in map value")
      println(mymap.mapValues(x=>"hi"+x))
      println("hello".map(_.toUpper))
      println("flatten method")
      println(List(List(1,2,3),List(3,4,5)).flatten)
      println("flatmap method")
      println(lst.flatMap(x=>List(x,x+1)))
      println(lst.filter(x=>x%2!=0))
      println(lst.map(x=>x+1).filter(x=>x>5))
      println(lst.flatMap(x=>List(x,x+1)))
      
      
      
    }
}