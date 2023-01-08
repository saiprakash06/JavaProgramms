package com.qa.coding;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		String s = "sdkfjsldj#$%$^%$";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
				
				

	}

}
