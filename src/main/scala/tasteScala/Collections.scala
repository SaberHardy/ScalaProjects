package tasteScala

import scala.collection.mutable.ArrayBuffer
import scala.math.Equiv

@main
def Collections(): Unit = {
  val a = List(13, 43, 5, 6, 8)
  val b = (1 to 15).toList
  val c = (1 to 20 by 3).toList
  val d = (1 until 20).toList
  val e = List.range(1, 5)

  //  def printList(): Unit = {
  //    // a.drop(2) // This delete the first two items
  //    println(a.dropWhile(_ < 10))
  //    println(c)
  //    println(c.filter(_ < 10).slice(0, 2))
  //    println(c.slice(2, 4))
  //
  //    // List d
  //    println(d.tail)
  //
  //    // Take first three numbers
  //    println(e.take(3))
  //  }
  //
  //  val flattenLists = List(a, b).flatten

  // Type Casting
  // Th order of casting is as follow
  // Byte - Short - Int - Long - Float - Double
  //                 |
  //                Char

  //  val x = 9
  //  var y: Double = x
  //
  //  println(y.toFloat)

  //  def addTwoStrings(i: String, i1: String): String = {
  //    var sum: String = ""
  //    sum = i + i1
  //    return sum
  //  }
  //
  //  val i = 90
  //  i match
  //    case a if 0 to 9 contains a => println(s"0-9 range: $a")
  //    case _ => println("Hmmm.....")
  //
  //  var text = ""
  //
  //  try
  //    println(addTwoStrings(i="Hi, ", i1="Hello!"))
  //  catch
  //    case hi: Error => println("Said hi")
  //    case hello: Error => println("Said hello!")
  /**/
  //  Different Lists
  // lists with specific type
  /*val ints: List[Int] = List(234, 4, 234, 3445, 456, 745756)
  val strings: List[String] = List("First", "Second", "Third")

  // Lists with different types
  val mixedList: List[Int | String | Double] = List(12, 212, "First", 4.4)
  println(mixedList)*/

  // Use ArrayBuffer

  val nbrs: ArrayBuffer[Any] = ArrayBuffer(2, 4, 3, 7, 4, 35)

  nbrs += 234 // Append at the end
  nbrs ++= List(23, "sd")
  println(nbrs)
  nbrs --= Seq(4, 35, "sd")
  println(nbrs)
}

// Adding elements to an ArrayBuffer
