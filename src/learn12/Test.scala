package learn12

/**
  * Created by anderson on 17-9-1.
  * Scala中的Trait可以定义抽象field, 而trait中的具体方法则可以基于抽象field来编写
  * 但是继承trait的类, 则必须覆盖抽象field, 提供具体的值
  */
trait SayHello {
  val msg : String
  def sayHello (name : String) = println(msg + ", " + name)
}

class Person (val name : String) extends SayHello {
  val msg : String = "hello"
  def makeFriends (p : Person): Unit = {
    sayHello(p.name)
    println("I'm" + name + ", i want to make friends with you")
  }
}
object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("zhangsan")
    val p2 = new Person("lisi")
    p1.makeFriends(p2)
  }
}
