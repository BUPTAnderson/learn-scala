package learn15

import java.io.File

import scala.io.Source

/**
  * Created by anderson on 17-9-3.
  */
class RichFile(f : File) {
  def read() : String = {
    Source.fromFile(f).mkString
  }
}

object RichFile {
  def main(args: Array[String]): Unit = {
    import MyPredef._
    val line = new File("/home/anderson/test.txt").read();
    println(line)
  }
}
