package learn04

/**
  * Created by anderson on 17-9-1.
  */
// 主构造器与类名交织在一起
class Person (val name : String, var age : Int) {
  var sex : String = "male"
  var address : String = "beijing"
  // 辅助构造器都叫this
  def this(name : String, age : Int, sex : String) {
    // 辅助构造器第一行必须首先调用主构造器
    this(name, age)
    this.sex = sex
  }

  def this(name : String, age : Int, sex : String, address : String) {
    // 辅助构造器第一行必须首先调用主构造器
    this(name, age, sex)
//    this.sex = sex
    this.address = address
  }

  println("hello")
  def sayHello(): Unit = {
    println("world")
  }
  sayHello()
}

object Test {
  println("haha")
  def main(args: Array[String]): Unit = {
    val person = new Person("zhangsan", 18)
    val person1 = new Person("lisi", 18)
    val person2 = new Person("wangwu", 17, "male")
    val person3 = new Person("wangwu", 17, "male", "shanghai")
  }
}