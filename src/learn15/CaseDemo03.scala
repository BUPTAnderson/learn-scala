package learn15

/**
  * Created by anderson on 17-9-1.
  * 匹配数组, 元组
  */
object CaseDemo03 extends App {
  // 匹配数组
  val arr = Array(1, 3, 5)
  arr match {
    case Array(1, x, y) => println(x + " " + y)
    case Array(0) => println("only 0")
    // 0开头, 后面任意
    case Array(0, _*) => println("0 ...")
    case _=> println("something else")
  }

  val lst = List(0, 10)
  lst match {
    // 0 加上空列表, 即列表里面只有0
    case 0 :: Nil => println("only 0")
      // 列表包含两个元素
    case x :: y :: Nil => println(s"x $x y $y")
      // 列表第一个元素是0, 后面包含任意数量和元素(可以是0个, 这是与第一个条件一样)
    case 0 :: tail => println("0...")
    case _ => println("something else")
  }

  // 匹配元组
  val tup = (0, 0, 0)
  tup match {
    case (1, x, y) => println(s"hello 123 $x, $y")
    case (_, z, 5) => println(z)
    case _ => println("else")
  }
}
