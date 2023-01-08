package com.qa.coding;

public class StringBufferVsStringBuilderVsString {

	public static void main(String[] args) {
		
		String s = "sai";
		s.concat("prakash");
		
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Rudra");
		
		sb.append("Anna");
		
		System.out.println(sb);

	}

}
