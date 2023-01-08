package com.qa.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicatesFromArray {

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {

		int[] intarr = { 1, 1, 4 };

		Set set = new HashSet();

		for (int i : intarr) {
			set.add(i);
		}

		System.out.println(set);

		int[] newarry = Arrays.stream(intarr).distinct().toArray();

		for (int j : newarry) {
			System.out.println(j);
		}

		// Traditional way

		int arr[] = { 10, 20, 20, 30, 20 };
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
