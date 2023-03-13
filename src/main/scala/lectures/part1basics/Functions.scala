package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b // compiler is able to figure out it is returning a string

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
  // a recursive function needs a return type!!

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION -- RECURSIVE FUNCTIONS

  // unit as a return type -- aka create function that returns a side effect
  // (such as unit)

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  // auxiliary functions - helper
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b:Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    2. Factorial function 1 * 2 * 3 * .. * n
    3. A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n-1) + f(n-2)
    4. Tests if a number is prime.
  */

  def aGreeting(name: String, age: Int): String = {
    s"Hi my name is $name and I am $age years old"
  }

  println(aGreeting("David", 12))

  def aFactorial(n: Int): Int = {
    if(n <= 0) 1
    else n * aFactorial(n-1)
  }

  println(aFactorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
