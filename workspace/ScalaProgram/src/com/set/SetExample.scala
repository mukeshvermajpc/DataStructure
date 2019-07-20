package com.set

object SetExample {
  val myset:Set[Int]=Set(1,2,3,3,4,8,9)
  val myset2:Set[Int]=Set(3,2,4,3,1)
  val names:Set[String]=Set("Mukesh","Raushan","Manish","Raj")
  def main(args:Array[String])
  {
    println(myset+10)
    println(names("Mukesh"))
    println(myset.head)
    println(myset.isEmpty)
    println(myset.tail)
    println("concatenation of two set")
    println(myset ++ myset2)
    println(myset.++(myset2))
    println("Intersection of two sets")
    println(myset.&(myset2))
    println("Max value of set "+myset.max)
    println("Min value of set "+myset.min)
    myset.foreach(println)
    for(name<-names)
    {
      print(name+" ")
    }
    
    
    
    
    
    
    
  }
}