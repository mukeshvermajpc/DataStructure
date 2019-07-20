package com.basic

object LoopExample {
  def main(args:Array[String])
  {
    var x=0
    while(x<10)
    {
      println("x = "+x)
      x=x+1
    }
    println("Do while loop")
    var y=0
    do{
       println("y= "+y)
       y+=1
     }while(y<=10)
    println("for loop")
    for( i<-1 to 5)
    {
      println(i)
    }
    println("for loop using until")
    for(i<-1 until 5)
    {
      println(i)
    }
    println("List in scala")
    val lst=List(1,2,3,4,5,6,7,8,9,123,43,564)
    for( i<-lst)
      println(i)
      
     for(l<-lst; if l>10)
       println("l using filter "+l)
      
      val result=for{i<-lst;if i<6}yield{i*i}
      println(result)
       
      
      
      
      
      
      
      
  
  
  }
}