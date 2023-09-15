package scalaPresntation

import scala.util.{Failure, Success}

@main
def main(): Unit = {
  /* First-Class Functions */
  //    val add = (a: Int, b: Int) => a + b
  //    def operate(a: Int, b: Int, op: (Int, Int) => Int): Int = op(a, b)
  //    val result = operate(3, 5, add) // Result will be 8
  //    println(result)

  /* Pure Functions */
  //    def pureFunction(x: Int, y: Int): Int = x + y
  //    println(pureFunction(2, 3))

  /* Immutable Collections */
//    val myList = List(1, 2, 3, 4)
//    val doubledList = myList.map(x => x * 2) // Creates a new list with doubled values
//    println(doubledList)

  /*  Pattern Matching​ */
//    def matchExample(x: Int): String = x match {
//      case 0 => "Zero"
//      case 1 => "One"
//      case _ => "Other"
//    }
//    println(matchExample(1))

  /* Recursion */
//    def factorial(n: Int): Int = {
//      if (n <= 1) 1
//      else n * factorial(n - 1)
//    }
//  println(factorial(5))

  /*Implicit Functions*/
  // Define a class
  //  case class Celsius(value: Double)
  //
  //  // Implicit function to convert Celsius to Fahrenheit
  //  implicit def celsiusToFahrenheit(celsius: Celsius): Double = {
  //    celsius.value * 9 / 5 + 32
  //  }
  //
  //  // Usage
  //  val celsiusTemperature = Celsius(20)
  //  val fahrenheitTemperature: Double = celsiusTemperature // Implicit conversion
  //
  //  println(s"$celsiusTemperature Celsius is $fahrenheitTemperature Fahrenheit")


  // Exceptions
  //  try {
  //    // Code that may throw an exception
  //    val result = 10 / 0
  //  } catch {
  //    case e: ArithmeticException => println(s"ArithmeticException: ${e.getMessage}")
  //    case ex: Exception => println(s"Generic Exception: ${ex.getMessage}")
  //  } finally {
  //    // Code that always executes, whether an exception occurred or not
  //  }

  //  Either
  /*
  * The Either type is used to represent values that can be one of two possible types:
  * Left (often used for errors) or
  * Right (often used for success).
  * It's a more explicit way of handling errors than exceptions.
  * */
  //  def divide(x: Int, y: Int): Either[String, Double] = {
  //    if (y == 0) Left("Cannot divide by zero")
  //    else Right(x.toDouble / y)
  //  }
  //  val result = divide(10, 0) match {
  //    case Right(value) => s"Result: $value"
  //    case Left(error) => s"Error: $error"
  //  }
  //  println(result)

  //  Try: The
  //  Try
  //  type is
  //  used to handle exceptions in a more functional and predictable way.It wraps an expression that may
  //  throw an exception and returns a Success
  //  with the result or a Failure
  //  with the exception.

  //  import scala.util.Try
  //
  //  def parseToInt(str: String): Try[Int] = Try(str.toInt)
  //
  //  val result = parseToInt("42") match {
  //    case Success(value) => value
  //    case Failure(ex) => 0
  //  }
  //  println(result)

  //  Custom Error Types
  //  sealed trait MyError
  //  case class NotFound(message: String) extends MyError
  //  case class ValidationError(field: String, message: String) extends MyError

}

