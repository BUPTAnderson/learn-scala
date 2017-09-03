package learn15

/**
  * Created by anderson on 17-9-3.
  * <: 相当于java中的extends
  * >: 相当于java中的super
  * A <% B 左边的类型是右边类型或者是其子类. 如果不是, 左边类型会隐式转换为右边的类型.
  */
class GrandFather() {}
class Father() extends  GrandFather{}
class Child() extends Father {}
class Worker2()

object Test4 {
  def getIDCard[R >: Child](person : R): Unit = {
    println("可以拿走身份证")
  }
  def main(args: Array[String]): Unit = {
    getIDCard[GrandFather](new GrandFather)
  }
}
