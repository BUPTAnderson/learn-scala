package quick.learn

/**
  * Created by anderson on 17-12-29.
  */
class Person(val name: String, val age: Int) {
  println("Just constructed another person")
  def description = s"$name is $age years old"
}

object Person {
  def main(args: Array[String]): Unit = {
    var person = new Person("Tom", 12)
    println(person.name + "\t" + person.age)
  }
}