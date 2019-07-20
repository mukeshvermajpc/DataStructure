package com

object tuple {
  val mytuple=(1,2,"hello",true)
  val mytuple2=new Tuple3(1,2,"hello")
  val mytuple3=new Tuple3(1,"hello",(2,3))
  def main(args:Array[String])
  {
    println(mytuple._1)
    println(mytuple._2)
    println(mytuple._3)
    println(mytuple._4)
    mytuple.productIterator.foreach{
      i=>println(i)
    }
    println(1->"Tom"->true)
    println(mytuple3._3._2)
  }
}