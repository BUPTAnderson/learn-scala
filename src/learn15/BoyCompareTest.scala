package learn15

/**
  * Created by anderson on 17-9-3.
  */
object BoyCompareTest {
  def main(args: Array[String]): Unit = {
    val arrs = Array[Boy](new Boy("wuyifan", 99), new Boy("luhan", 200), new Boy("laoli", 9999))
    val resultBoy : Array[Boy] = arrs.sorted
    println(resultBoy.toBuffer)
  }
}
