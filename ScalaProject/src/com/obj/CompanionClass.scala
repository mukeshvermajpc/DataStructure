package com.obj
class CompanionClass {
  def hello()
  {
    println("Hello, this is Companion Class")
  }
}
object CompanionClass{
   def main(args:Array[String])
   {
     var obj=new CompanionClass()
     obj.hello()
     new CompanionClass().hello()
     println("and this is Companion Object")
   }
}