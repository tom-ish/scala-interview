package com.particeep.test.basic

/**
 * Compute the avarage of the list
 *
 * ex : [1, 10, 16] -> 9
 */
object ComputeAverage {

  def average(l: List[Double]) =
    l.reduce(_ + _) / l.size // <=> l.sum/l.size
}
