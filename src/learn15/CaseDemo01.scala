package learn15

import scala.util.Random

/**
  * Created by anderson on 17-9-1.
  */
object CaseDemo01 extends App {
  val arr = Array("Hadoop", "HBase", "Spark")
  val name = arr(Random.nextInt(arr.length))
  name match {
    case "Hadoop" => println("大象")
    case "HBase" => println("noSQL")
    case _=> println("真不知道你们在说什么")
  }
}
