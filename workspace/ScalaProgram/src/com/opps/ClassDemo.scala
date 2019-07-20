package com.opps
//scala class
// var getter setter
// val getter
// default
class User(private var name:String,val age:Int)
{
  def printName
  {
    println(name)
  }
}

object ClassDemo {
  def main(args:Array[String])
  {
    var user=new User("Raushan",24)
    user.printName
    println(user.age)
    
  }
}