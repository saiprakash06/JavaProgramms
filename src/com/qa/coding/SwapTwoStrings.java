package com.qa.coding;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Sai"; //3
		String b ="Prakash"; //7
		
		
		
		a = a+b; //SaiPrakash // length = 10
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		
		System.out.println(a);
		System.out.println(b);
		
		
		// Swap 2 Integers
		
		int x =2;
		int y=3;
		
	   // algoritham
	   //2+3= 5 // c=5
		
		x = x+y;
		
		y=x-y; // 5-3 =2
		
		x=x-y; //5 -2 =3
		
		System.out.println(x);
		System.out.println(y);

	}

}
