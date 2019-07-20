package com.map
object MapExample {
  val mymap:Map[Int,String]=Map(801->"Shashank",802->"Manish",101->"Shahbez",102->"Mukesh",103->"Raushan")
  val mymap2:Map[Int,String]=Map(105->"Binit")
  def main(args:Array[String])
  {
    println(mymap)
    println("Search in map by key")
    println(mymap(801))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)
    mymap.keys.foreach {key=>
      println("key "+key)
      println("Value "+mymap(key))
    }
    println(mymap.size)
    println(mymap ++ mymap2)
  }
}