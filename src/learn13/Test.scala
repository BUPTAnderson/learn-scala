package learn13

/**
  * Created by anderson on 17-9-1.
  * 有时我们可以在创建类的对象时, 指定该对象混入某个trait, 这样, 就只有这个对象混入该trait的方法,
  * 而类的其它对象则没有
  */
trait Logged {
  def log (msg : String): Unit = {
  }
}

trait AMyLogger extends Logged {
  override def log(msg: String): Unit = {
    println("test:" + msg)
  }
}

trait BMyLogger extends Logged {
  override def log(msg: String): Unit = {
    println("log:" + msg)
  }
}

class Person (val name : String) extends AMyLogger {
  def sayHello(): Unit = {
    println("Hi, i'm name" + name)
    log("sayHello is invoked!")
  }
}
object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("zhangsan")
    p1.sayHello()

    // 混入了BMyLogger
    val p2 = new Person("lisi") with BMyLogger
    p2.sayHello()
  }
}
