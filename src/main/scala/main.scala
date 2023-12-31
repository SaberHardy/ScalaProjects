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

    val fruitLength: Unit = for (f <- fruits) {
      if (f.length >= 4) {
        println(f)
      }
    }
  }

  trait Speaker:
    def speak(): String

  trait TailWagger:
    def startTail(): Unit = println("Tail is wagging")

    def endTail(): Unit = println("Tail is stopped")

  trait Runner:
    def startRunning(): Unit = println("Start Running")

    def endRunning(): Unit = println("End Running")

  class Dog(name: String) extends Speaker, TailWagger, Runner:
    def speak(): String = "Woof!"

  class Cat(name: String) extends Speaker, TailWagger, Runner:
    def speak(): String = "Meow!!"

    override def startRunning(): Unit = println("The cat is not running!")

    override def endRunning(): Unit = println("The cat is sleeping now!")


  val dog = Dog("Rover!!")
  //  println(dog.speak())

  val cat = Cat("Michou")
  //  println(dog.speak())

  class Person(var firstname: String, var lastname: String):
    def printFullname(): Unit = {
      println(s"Full name is: $firstname $lastname")
    }

  //  var person = Person("Saber","Bounehas")
  //  person.printFullname()

  /* Pizza Sizes
  * Suppose we have a pizza that has three main attributes
  * Crust Size, Crust Type, Topping
  *  */
  enum CrustSize:
    case Small, Medium, Large

  enum CrustType:
    case Thin, Thick, Regular

  enum Topping:
    case Cheese, Pepperoni, BlackOlives, Onions

  import CrustSize.*

  val currentPizzaSize = Small

  currentPizzaSize match
    case Small => println("Small Pizza")
    case Medium => println("Medium Pizza")
    case Large => println("Large Pizza")

  if currentPizzaSize == Small then println("Small pizza ordered!")
}


