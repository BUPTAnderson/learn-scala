package learn15

/**
  * Created by anderson on 17-9-3.
  */
class Pair[T <: Comparable[T]] {
  def shuai(first : T, second : T): T = {
    if (first.compareTo(second) < 0) first else second
  }
}

object Test3 {
  def main(args: Array[String]): Unit = {
    val pair = new Pair[Boy]
    val shuaiGe : Boy = pair.shuai(new Boy("wuyifan", 99), new Boy("wo", 999))
    println(shuaiGe)
  }
}