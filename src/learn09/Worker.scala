package learn09

/**
  * Created by anderson on 17-9-1.
  * Trait(特质, 有接口的特性)
  * 特质里面的方法既可以实现, 也可以不实现, 那么跟抽象类有什么区别
  * 抽象类, 我们用的是extends, 我们只能单继承, 但是我们可以多实现.
  * 实现特质, 如果没有继承其它类, 那么使用第一个特质使用extends, 后面的使用with, 所以如果有考题说实现特质只能使用with, 这个是不对的.
  *
  * 特质作为接口使用
  * Scala中的Trait是一种特殊的概念
  * 首先我们可以将Trait作为接口来使用, 此时的Trait就与Java中的接口非常类似
  * 在Trait中可以定义抽象方法, 就与抽象类中的抽象方法一样, 只要不给出方法的具体实现即可
  * 类可以使用extends关键字继承Trait, 注意, 这里不是implements, 而是extends, 在scala中没有implements的概念, 无论继承类还是trait, 统一都是extends
  * 类继承Trait后, 必须实现其中的抽象方法, 实现时不需要使用override关键字
  * scala不支持对类进行多继承, 但是支持多重继承Trait, 使用with关键字即可
  */
trait HelloTrait {
  def sayHello (name : String)
}

trait MakeFriendsTrait {
  def makeFriends (w : Worker)
}
class Worker (var name : String) extends HelloTrait with MakeFriendsTrait{
  override def sayHello(name: String): Unit = println("Hello, " + name)

  override def makeFriends(w: Worker): Unit = println("hello, my name is " + name + " your name is " + w.name)
}

object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Worker("zhangsan")
    val p2 = new Worker("lisi")
    p1.sayHello("wangwu")
    p1.makeFriends(p2)
  }
}