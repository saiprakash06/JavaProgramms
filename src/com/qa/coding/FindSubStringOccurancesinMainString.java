package com.qa.coding;

public class FindSubStringOccurancesinMainString {

	public static void toGetSubStringCount() {

		String str = "PrakashSaiPrakashPrPr";

		String findstr = "Pr";

		int counter = 0;

		for (int i = 0; i < str.length() - 1; i = i + findstr.length()) {

			String fetchedResult = str.substring(i, i + findstr.length());
			if (fetchedResult.equals(findstr)) {
				counter++;
			}

		}

		System.out.println(counter);

	}
	
	
	public static void toGetSubStringCountUsingSplit() {
		
		String str = "PrakashSaiPrakash";

		String findstr = "a";
		
		System.out.println(str.split(findstr, -1).length-1);
		
	}
	
	
public static void toGetSubStringCountUsingHashMap() {
		
		String str = "PrakashSaiPrakash";
		
		char[] chr =str.toCharArray();

		for(char s : chr) {
			System.out.println(s);
		}
		
		
		
	}

	public static void main(String[] args) {

		String str = "PrakashSaiPrakashPr";

		String findstr = "Pr";
		int lastIndex = 0;
		int counter = 0;

		while (lastIndex != -1) {

			lastIndex = str.indexOf(findstr, lastIndex);

			if (lastIndex != -1) {
				counter++;
				lastIndex = lastIndex + findstr.length();
			}

		}

		System.out.println(counter);

		//toGetSubStringCount();
//		toGetSubStringCountUsingSplit();
//		toGetSubStringCountUsingHashMap();

	}

}
