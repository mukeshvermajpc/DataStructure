package com.obj

class Student2(id:Int,name:String) {
  var age:Int=0
  def showDetails(){
    println("id "+id+" name: "+name+"age"+" "+age)
  }
  def this(id:Int,name:String,age:Int)
  {
    this(id,name)
    this.age=age
  }
}