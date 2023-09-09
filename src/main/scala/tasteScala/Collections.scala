package tasteScala

@main
def Collections(): Unit = {
  val a = List(13, 43, 5, 6, 8)
  val b = (1 to 15).toList
  val c = (1 to 20 by 3).toList
  val d = (1 until 20).toList
  val e = List.range(1, 5)

  def printList(): Unit = {
    // a.drop(2) // This delete the first two items
    println(a.dropWhile(_ < 10))
    println(c)
    println(c.filter(_ < 10).slice(0, 2))
    println(c.slice(2, 4))

    // List d
    println(d.tail)

    // Take first three numbers
    println(e.take(3))
  }

  val flattenLists = List(a, b).flatten
  println(flattenLists)

}
