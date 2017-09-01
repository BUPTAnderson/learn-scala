package learn03

/**
  * Created by anderson on 17-9-1.
  */
class Student {
  var name : String = "zhangsan"
  val id : Int = 123
  private var hight : Int = 175
  private[this] val password : String = "12345"
  def getPasswd() : String = {
    return password
  }
}

// Student的伴生对象, object中声明的属性都是静态的, 方法也都是静态的
object Student {
  def main(args: Array[String]): Unit = {
    val s = new Student()
    s.name = "lisi"
    println(s.name)
    // id的属性是不能修改的
    println(s.id)
    println(s.hight)
    // 访问不到password对象
    // s.password
    // 通过方法可以访问到
    println(s.getPasswd())
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val s = new Student()
    s.id
    s.name
    // 访问不到hight对象
  }
}