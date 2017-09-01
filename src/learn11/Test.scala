package learn11

/**
  * Created by anderson on 17-9-1.
  * Scala中的Trait可以定义具体field, 此时继承trait的类就自动获得了trait中定义的field
  * 但是这种获取field的方式与继承class是不同的, 如果是继承class获取的field, 实际是定义在父类中的
  * 而继承trait获取的field, 就直接被添加到了类中
  */
trait Person {
  val eyeNum : Int = 2
}

class Student (val name : String) extends Person {
  def sayHello(): Unit = {
    println("Hi, I'm " + name + ", i have " + eyeNum + " eyes!")
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val s = new Student("zhangsan")
    s.sayHello()
  }
}
