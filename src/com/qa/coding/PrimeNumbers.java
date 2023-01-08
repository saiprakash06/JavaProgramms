package com.qa.coding;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Divisible by one and itself

		// Examples : 2, 3, 5, 7, 11, 13, 17, 19, 23, 29

		// Need to print list of prime numbers

		String s = "";

		for (int i = 2; i <= 30; i++) {

			if (!(i % 2 == 0)) {

				s = s + " " + i;

			}
		}

		System.out.println(s);

	}

}
