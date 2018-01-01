package quick.learn.class3

/**
  * 利用object对象实现单例模式
  */
object CreditCard {


  // 变量保存信用卡号
  private[this] var creditCardNumber: Long = 0

  // 产生新的卡号
  def generateNewCCNumber(): Long = {
    creditCardNumber += 1
    creditCardNumber
  }

  // 测试程序
  def main(args: Array[String]): Unit = {
    // 产生新的卡号
    println(CreditCard.generateNewCCNumber())
    println(CreditCard.generateNewCCNumber())
    println(CreditCard.generateNewCCNumber())
    println(CreditCard.generateNewCCNumber())
  }
}
