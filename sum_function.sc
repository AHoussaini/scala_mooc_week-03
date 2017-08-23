package week_3

object sum_function {
  def sum(f: Int => Int): (Int, Int) => Int = {
  	def sumF(a: Int, b: Int): Int =
  		if (a>b) 0
  		else f(a) + sumF(a+1,b)
  		sumF
 }                                                //> sum: (f: Int => Int)(Int, Int) => Int
 def sumInits = sum(x=>x)                         //> sumInits: => (Int, Int) => Int
 def sumCubes = sum(x=>x*x*x)                     //> sumCubes: => (Int, Int) => Int
 //def sumFactorials = sum(fact)
 sumCubes(1,10)                                   //> res0: Int = 3025

 
  def sumbis(f: Int => Int)(a:Int, b: Int): Int ={
  	if (a>b) 0	else f(a) + sum(f)(a+1,b)
  	}                                         //> sumbis: (f: Int => Int)(a: Int, b: Int)Int
  	
  sumbis(x=>x)(1,3)                               //> res1: Int = 6
}