package com.basic

object Input {
  def main(args:Array[String])
  {
    val name=readLine("Enter your name   ")
    print("Enter your age")
    val age=readInt()
    println("Your name is: "+name)
    println("You are " + age +" year old")
    
    println(name.length())
    println(name.reverse)
    println(name.charAt(0))
    
  }
}