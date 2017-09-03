package learn18

/**
  * Created by anderson on 17-9-3.
  */
class Master {
}

class Professional extends Master
class Card[-T](val name : String) // - 支持逆变, T的父类也可以
class Worker(val name : String)

object Test {
   def enterMeet(card : Card[Professional]): Unit = {
     println("Welcom to this metting, " + card.name + " !")
   }

  def main(args: Array[String]): Unit = {
    val card1 = new Card[Master]("zhangsan")
    enterMeet(card1)
    val card2 = new Card[Professional]("lisi")
    enterMeet(card2)

//    val worker = new Worker
//    enterMeet(worker)
  }
}