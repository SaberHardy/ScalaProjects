@main
def main(): Unit = {
  def print_on_specific_condition(): Unit = {
    for
      i <- 1 to 5
      j <- 'a' to 'e'
      if i == 2
      if j == 'b'
    do println(s"i = $i and j = $j")
  }

  def forloopFruits(): Unit = {
    val fruits = List("Banana", "Apple", "Lime", "Orange")

    val fruitLength = for
      f <- fruits
      if f.length > 4
    yield
      f.length
  }

  print(forloopFruits())
}

