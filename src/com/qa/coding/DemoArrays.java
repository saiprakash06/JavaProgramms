package com.qa.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrays {

	public static void main(String[] args) {

		Integer[] intarr = { 1, 2, 3, 4, 5, 6, 6 };

		int[] arr = new int[] { 1, 2, 3 };

		String s = "sdkfj";

		List<Integer> list = Arrays.asList(intarr);
		
		List lw = list.stream().filter(k->k>5).distinct().collect(Collectors.toList());
		
		System.out.println(lw);
		
		

		//System.out.println(list);
		
//		List ls =list.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(ls);
//		
//		Integer [] newarr = new Integer[ls.size()];
//		
//		ls.toArray(newarr);
//		
//		for(Integer i : newarr) {
//			System.out.println(i);
//		}

	}

}
