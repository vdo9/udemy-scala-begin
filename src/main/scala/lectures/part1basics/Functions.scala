package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  //  def aFunction(a: String, b: Int): String = {
  //    a + " " + b
  //  } <--- valid function as well

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  //  println(aParameterlessFunction) <--- can't do this

  def aRepeatedFunction(aString: String, n: Int): String = { // recursive function
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION -- RECURSIVE FUNCTIONS


}
