package week_3

object fixed_point {
  def abs(x:Double) = if (x < 0) -x else x
  val tolerance = 0.0001
  def ifCloseEnought(x: Double, y:Double) =
  	abs((x-y)/x) < tolerance
  	
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double =
  }
}