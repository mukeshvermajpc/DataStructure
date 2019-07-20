package com.map
// scala -Reduce,fold or scan(Left/right)
//redcuceLeft, reduceRight,foldLeft,foldRight
object ReduceExample {
  val lst = List(1, 2, 3, 5, 10, 13)
  val lst2 = List("A", "B", "C")
  def main(args: Array[String]) {
     println(lst.reduceLeft(_+_))
     println(lst2.reduceLeft(_+_))
     println(lst.reduceLeft((x,y)=>{println(x+", "+y);x+y}))
     println(lst.reduceLeft(_-_))
     println(lst.reduceRight(_-_))
     println(lst.reduceRight((x,y)=>{println(x+" , "+y);x-y}))
     println(lst.foldLeft(100)(_+_))
     println(lst2.foldLeft("z")(_+_))
     println(lst.scanLeft(100)(_+_))
     println(lst.scanLeft("z")(_+_))
     println("scan right")
     println(lst.scanRight("raj")(_+_))
  }
}