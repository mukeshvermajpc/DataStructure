package com.obj

class Employee(id:Int) {
   def this(id:Int,name:String)= {
     this(id)
     println(id+" "+name)
   }
   println(id)
}
object MainObjectConstOverload{
  def main(args:Array[String])
  {
    new Employee(101)
    new Employee(102,"Mukesh Verma")
  }
}