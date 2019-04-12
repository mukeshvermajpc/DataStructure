package com.obj

class Student(id:Int,name:String) {
  def show()
  {
    println(id+" "+name)
  }
}
object MainObject{
  def main(args:Array[String])
  {
    var obj1=new Student(12,"Mukesh Verma")
    var obj2=new Student(14,"Raushan Kumar")
    println("Student Details")
    obj1.show()
    obj2.show()
  }
}