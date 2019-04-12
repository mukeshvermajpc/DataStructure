package com.obj

class Student1(id:Int,name:String) {
  def showDetails()
  {
    println(id+" "+name)
  }
}
object MainObject2{
    def main(args:Array[String])
    {
     new Student1(101,"Mukesh Verma").showDetails()
    }
}