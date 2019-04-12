package com.obj

class A {
  var salary=1000
}
class B extends A
{
 var salary2=20000  
}
class C extends B
{
   def show()
   {
     println("Salary 1"+salary)
     println("Salary 2"+salary2)
   }
}
object Multilevel{
  def main(args:Array[String])
  {
    var obj=new C()
    obj.show()
  }
}