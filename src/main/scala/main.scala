@main
def main(): Unit = {
  var mylist = List(57,234,23,4,23423,4)
  for (item <- mylist) {
    println(item)
    println(", ")
  }
}

