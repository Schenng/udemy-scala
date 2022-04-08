package lectures.part1basics

object ValuesVariablesTypes extends App {

  // Vals are immutable
  val aInt: Int = 1 // four bytes
  val aShort: Short = 4613 // two bytes
  val aLong: Long = 412345212 // eight bytes
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.0

  val aString: String = "Simon"
  val aBoolean: Boolean = true
  val aChar: Char = 'a'

  // Variables (mutable)
  var aVariable = 4
  aVariable = 5 // side effects


  println(aInt)
  println(aString)
  print(aBoolean)
}
