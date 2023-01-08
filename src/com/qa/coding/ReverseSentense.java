package com.qa.coding;

public class ReverseSentense {

	public static void main(String[] args) {
		String s = "Sai is Great"; // output should be taerG si iaS
		char chr;
		String finsString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			chr = s.charAt(i);
			finsString=finsString+chr;
		}
		
		System.out.println(finsString);

	}

}
