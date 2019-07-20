package com.arrays
object ArrayExample {
  val myarr:Array[Int]=new Array[Int](4)
  val myarr2=new Array[Int](5)
  def main(args:Array[String])
  {
    myarr2(0)=10
    myarr2(1)=20
    myarr2(2)=30
    myarr2(3)=40
    myarr2(4)=50
    println(myarr2.length)
    for(i<-myarr2){println(i)}
    println("Array in scala")
    for(i<- 0 to (myarr2.length-1))
      println(myarr2(i))
    
    
  }
}