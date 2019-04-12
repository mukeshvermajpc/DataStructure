package com.basic

object ForLoopTwo {
   def main(args:Array[String])
   {
     var list=List(1,2,3,4,5,6,8,9);
     for(i<- list)
       println(i)
     list.foreach(print)
     println()
     list.foreach((element:Int)=>print(element+" "))
       
       
       
       
   }
}