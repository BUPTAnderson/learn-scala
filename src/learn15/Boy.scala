package learn15

/**
  * Created by anderson on 17-9-3.
  */
class Boy(var name : String, var faceValue : Int) extends Comparable[Boy] {
  override def compareTo(o: Boy): Int = {
    o.faceValue - this.faceValue
  }

  override def toString: String = {
    s"name: ${name} facevalue: ${faceValue}"
  }
}
