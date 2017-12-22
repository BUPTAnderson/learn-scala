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
    val name = StdIn.readLine("Your name: ")
    print("Your age: ")
    val age = StdIn.readInt()
    println(s"Hello, ${name}! Net year, you will be ${age + 1}.")

    grep(".*for.*")
  }

  def reorderArray(arr: Array[Int]): Array[Int] = {
    (for (i <- 0 until(arr.length, 2)) yield if (i + 1 < arr.length) Array(arr(i + 1), arr(i)) else Array(arr(i))).flatten.toArray
  }
}
