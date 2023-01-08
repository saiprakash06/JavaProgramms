package com.qa.coding;

import java.util.HashMap;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String str = "Sai Prakash Sai great Prakash Sai";

		// System.out.println(str.split("Sai", -1).length-1);

		String[] newStringArr = str.split(" ");
		
		String wordsCount="";
		
		int counter1=0;
		
		for(String word : newStringArr ) {
			
			for(int i =0;i<newStringArr.length;i++) {
				
				if(word.equals(newStringArr[i])) {
					counter1++;
					
				}
			}
			
			wordsCount=wordsCount+word+counter1;
			counter1=0;
			
		}
		
		System.out.println(wordsCount);

		int counter = 1;

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String s : newStringArr) {

			if (hm.containsKey(s)) {
				hm.put(s, counter);
				counter++;
			}else {
				hm.put(s, 1);
			}
		}
		
		System.out.println(hm);

	}

}
