package learn14

/**
  * Created by anderson on 17-9-1.
  * scala中支持让类继承多个trait后, 依次调用多个trait中的同一个方法, 只要让多个trait的同一个方法中,
  * 在最后都执行super. 方法即可
  * 类中调用多个trait中都有的这个方法时, 首先会从最右边的trait的方法开始执行, 然后依次往左执行, 形成一个调用链条
  * 这种特性非常强大, 其实就相当于设计模式中的责任链模式的一种具体实现依赖
  */
trait Handler {
  def handler(data : String): Unit = {
  }
}

trait DataValidHandler extends Handler {
  override def handler(data: String): Unit = {
    println("check data:" + data)
    super.handler(data)
  }
}

trait SignatureValidHandler extends Handler {
  override def handler(data: String): Unit = {
    println("check signature:" + data)
    super.handler(data)
  }
}

class Person (val name : String) extends SignatureValidHandler with DataValidHandler {
  def sayHello = {
    println("Hello " + name)
    handler(name)
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val p = new Person("lisi")
    p.sayHello
  }
}
