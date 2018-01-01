package quick.learn.class3

/**
  * Created by anderson on 17-12-29.
  */
class Person2(val name: String, val age: Int) {
  println("Just constructed another person")
  def description = s"$name is $age years old"
}

object Person2 {
  def main(args: Array[String]): Unit = {
    var person = new Person2("Tom", 12)
//    println(person.name + "\t" + person.age)
  }
}