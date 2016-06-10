def isGoodEnough(guess: Double, x: Double): Boolean =
  (Math.abs(guess * guess - x) < 0.001)

def improve(guess: Double, x: Double): Double =
  (guess + x/guess)/2

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)


sqrtIter(1, 2)
sqrtIter(1, 4)