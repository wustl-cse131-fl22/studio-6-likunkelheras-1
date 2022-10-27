package studio6;

import java.util.Arrays;

import java.util.DoubleSummaryStatistics;

import org.junit.validator.PublicClassValidator;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {

			// FIXME compute the geometric sum for the first n terms recursively
		if (n == 0) {
			return 0;
		} else {
			return geometricSum(n-1)+Math.pow(0.5, n);
		}	
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
		if (q==0)// FIXME compute the gcd of p and q using recursion
			return p;
		else {
			return gcd(q , p%q);
		}
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	
	
	public static int[] toReversed(int[] array) {
		return withIndex (array, array.length - 1);
			// FIXME create a helper method that can recursively reverse the given array
	}
	public static int[] withIndex (int[] array, int index1) {
		int[] reversed = Arrays.copyOf(array, array.length);
		if (array.length==0) {
			return new int[0];		
		}
		if(index1 < array.length / 2)
		{
			return array;	
		}
		else {
			int lastIndex = array.length - 1;
			int mirrorIndex = lastIndex - index1;
			reversed[index1] = array[mirrorIndex];
			reversed[mirrorIndex] = array[index1];
			return withIndex(reversed, index1-1);
			
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
