package learn01

/**
  * Created by anderson on 17-8-31.
  */
object HelloWorld {
  // Unit类似于java中的void
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val array = Array(1, 2, 3, 4)
    val a  = array.map((x : Int) => 2 * x)
    for(x <- a)
      println(x)

    for(x <- array.map((x) => 3 * x))
      println(x)

    for(x <- array.map(x => 4 * x))
      println(x)

    for(x <- array.map(_ * 5))
      println(x)
  }
}
