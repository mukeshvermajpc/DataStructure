package com.obj

object SingletonObject {
  def main(args:Array[String])
  {
    Singleton.hello()
  }
}
object Singleton{
  def hello()
  {
    println("this is hello method of scala")
  }
}