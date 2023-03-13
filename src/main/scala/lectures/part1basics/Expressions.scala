package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSIONS
  println(x)

  println(2+3*4)
  //+ - * / & | ^ << >> >>> (bitwise operator)

  println( 1 == x)
  // == != > >= < <=

  print(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // works with -= *= /= .... side effects when changing variables
  println(aVariable)

  // Instructions (DO) vs. Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

  var i = 0
  var aWhile = while (i < 10) {  // side effects return units
    println(i)
    i +=1
  }

   // NEVER WRITE THIS AGAIN

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue =  (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning
  // instructions returning units

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //  val anotherValue = z + 1 (*z is not visible outside*)

  // 1. difference between "hello world" vs println("hello world")?
    // first is an expression - string literal
    // second is an instruction - a unit - a side effect of printing to console
  // 2.

  val someValue = { // contains value of last expression
    2 < 3
  } // true

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  } // 42

}
