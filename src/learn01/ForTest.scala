package learn01

/**
  * Created by anderson on 17-8-31.
  */
object ForTest {
  def main(args: Array[String]): Unit = {
    // for(i <- 表达式), 表达式1 to 10返回agielRange(区间)
    // 每次循环将区间中的一个值赋给i
    for (i <- 1 to 10)
      println(i)

    // for(i <- 数组)
    val arr = Array("a", "b", "c")
    for (i <- arr)
      println(i)

    // 高级for循环
    // 每个生成器都可以带一个条件, 注意: if前面没有分号
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println((10 * i + j) + " ")
    println()
  }
}
