package com.obj

class ThisExample {
  var id:Int=0
  var name:String=""
  def this(id:Int,name:String)
  {
    this()
    this.id=id
    this.name=name
  }
  def show()
  {
    println(id+"  "+name)
  }
}
object ThisExample1{
  def main(args:Array[String])
  {
    var obj=new ThisExample(101,"Raushan Kumar")
    obj.show()
  }
}