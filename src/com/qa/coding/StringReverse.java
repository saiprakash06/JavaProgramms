package com.qa.coding;

public class StringReverse extends Sushma{
	
	
	private void add() {
		System.out.println("askdjfksj");
	}

	public static void main(String[] args) {

		String str = "SaiPrakash";
		String str1 ="SaiPrakash";
		
		
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char c = str.charAt(i);
			reverseString = reverseString + c;

		}

		System.out.println(reverseString);
		
		System.out.println(str.length());
		
		StringReverse r = new StringReverse();
		r.add();
		
		StringReverse dd = new StringReverse();
		dd.subadd();

	}
	
	
	
	
	
	
	
	


}


interface  Prakash{
	
	
	
}


class Sushma{
	
	final void subadd() {
		System.out.println("add method");
	}
	
	final void subadd(int a) {
		System.out.println("add method");
	}
	
	void sldkf() {
		System.out.println("ksdjflksdj");
	}
}
