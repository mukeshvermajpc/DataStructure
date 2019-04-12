package com.obj

class ThisExampleTwo(name:String) {
  def this(name:String,age:Int)
  {
    this(name)
    println(name+" "+age)
  }
}
object ThisExampleTwo1{
  def main(args:Array[String])
  {
    var s=new ThisExampleTwo("Mukesh Verma",101)
  }
}