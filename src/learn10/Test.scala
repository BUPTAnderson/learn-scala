package learn10

/**
  * Created by anderson on 17-9-1.
  * scala中的Trait可以不是只定义抽象方法, 还可以定义具体方法, 此时trait更像是包含了通用工具方法的东西
  * 有一个专有的名词来形容这种情况, 就是说trait的功能混入了类
  * 举例来说, trait中可以包含一些很多类都通用的功能方法, 比如打印日志等等, spark中就使用了trait来定义了通用的日志打印方法
  */
trait Logger {
  def log(message : String) = println(message)
}

class Person(val name : String) extends Logger {
  def makfriends (p : Person): Unit = {
    println("I'm " + name + ", i'm glade to make friends with you " + p.name)
    log("makeFriend method invoked!")
  }
}
object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("zhangsan")
    val p2 = new Person("lisi")
    p1.makfriends(p2)
  }
}
