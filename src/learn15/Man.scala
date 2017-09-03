package learn15

/**
  * Created by anderson on 17-9-3.
  * 隐式转换
  */
class Man(val name : String) {

}

class SuperMan(val name : String) {
  def emitLaster = println("emit laster")
}

object Test {
  implicit def man2SuperMan(man : Man) : SuperMan = new SuperMan(man.name)
  def main(args: Array[String]): Unit = {
    val man = new Man("zhangwuji")
    man.emitLaster
  }
}