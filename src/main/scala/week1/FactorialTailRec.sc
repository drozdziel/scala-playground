def factorialX(x: Int, acc: Int): Int =
  if (x == 0) acc else  factorialX(x -1, acc*x)

def factorial(x: Int): Int = factorialX(x, 1)
factorial(5)