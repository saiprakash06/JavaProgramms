package com.qa.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CheckingKnowledge {

	public static void main(String[] args) {

		// Remove duplicates from Integer Array
		Integer[] numArr = { 1, 2, 3, 4, 1, 2 };
		List<Integer> list = Arrays.asList(numArr);
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		Integer[] finalArr = new Integer[list2.size()];
		list2.toArray(finalArr);
		for (int i : finalArr) {
			System.out.println(i);
		}

		// Check duplicate words from sentence
		String sentence = "Great deal is Great is";
		HashMap<String, Integer> Hm = new HashMap<String, Integer>();
		String[] strngArr = sentence.split(" ");
		for (String s : strngArr) {
			if (Hm.containsKey(s)) {
				Hm.put(s, Hm.get(s) + 1);
			} else {
				Hm.put(s, 1);
			}
		}

		System.out.println(Hm);

		// Check how many time substring repeats in mainString
		String mainString = "PrakashPrPrPr";
		String subString = "Pr";
		int counter = 0;
		int Index = 0;
		while (Index != -1) {
			Index = mainString.indexOf(subString, Index);
			if (Index != -1) {
				counter++;
				Index = Index + subString.length();
			}

		}

		System.out.println(counter);

	}
}
