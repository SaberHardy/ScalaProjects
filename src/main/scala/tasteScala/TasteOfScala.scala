@main
def TasteOfScala(): Unit = {
  //  Class Function used in Scala
  /*
  * There are Three main of functional programming in scala
  1- Lambdas  (anonymous function)
  2- Higher-order functions (HOF)
  3- Immutable collections in the standard library
  */

  // 1 Lambdas functions
  //1.a = Built-in functions
  val a = List(2, 4, 6, 5, 4, 3).map(i => i % 2)

  //  1.a = User function

  val l1 = List(1, 1, 2, 3, 5, 8)
  val l2 = List(13, 21, 34)

  // squaring each element of the lists
  val func = (x: Int) => x * x

  val res1 = l1.map(func)
  val res2 = l2.map(func)

  println()
}
