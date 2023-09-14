package scalaPresntation

@main
def main(): Unit = {
  val add = (a: Int, b: Int) => a + b
  def operate(a: Int, b: Int, op: (Int, Int) => Int): Int = op(a, b)
  val result = operate(3, 5, add) // Result will be 8

//  println(result)

}

