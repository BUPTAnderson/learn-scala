package quick02

import scala.io.StdIn

/**
  * Created by anderson on 17-12-20.
  */
object Test {
  val filesHere = (new java.io.File("/home/anderson/GitHub/learn-scala/src/learn01")).listFiles

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

  // 多重循环, 循环直间使用;分割
  def grep(pattern: String) =
  for (
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  ) println(file + ": " + line.trim)

  //  grep(".*gcd.*")

  def main(args: Array[String]): Unit = {
//    val name = StdIn.readLine("Your name: ")
//    print("Your age: ")
//    val age = StdIn.readInt()
//    println(s"Hello, ${name}! Net year, you will be ${age + 1}.")
//
//    grep(".*for.*")
//    print(isort(List(4, 3, 2, 1)).mkString(","))
//    print(ipToBinaryString("210.77.128.0").substring(0, 19))
    print(ipToBinaryString("210.77.128.0"))
  }

  def reorderArray(arr: Array[Int]): Array[Int] = {
    (for (i <- 0 until(arr.length, 2)) yield if (i + 1 < arr.length) Array(arr(i + 1), arr(i)) else Array(arr(i))).flatten.toArray
  }

  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)

  private def ipToBinaryString(ip: String): String = {
    ip.split("""\.""").map(x => x.toInt.toBinaryString).map(x => {
      val preLen = 8 - x.length
      val preTxt = "0" * preLen
      preTxt + x
    }).reduce(_ + _)
  }
}
