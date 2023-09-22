package com.promineotech;

import java.util.Arrays;
import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {

		if (a > 0 && b > 0) {
			return a + b;
		} else
			throw new IllegalArgumentException("Both parameters must be positive!");
	}

	public int randomNumberSquared() {
		int base = getRandomInt();
		return base * base;
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;

	}

	public int findMedianNumber(int[] numbers)  {
		
		int length = numbers.length;
		if (length != 0) {			//checks for empty array
			
			Arrays.sort(numbers); // Sorts the array
		
		
			if (length % 2 == 1) {
				int median = numbers[(length - 1) / 2]; // if the number of ints in the array is odd, the median is the
														// length of the array minus one, divided by two
				return median;
			} else {
				int median = (numbers[length / 2] + numbers[(length / 2) - 1]) / 2; // else, if the number of ints in the
																					// array is even, the median is the
				return median;														// average of the two middle values
				}
			}
			else {
				throw new IllegalArgumentException ("The Array is Empty, no median");
			}
		
	
		}
}
