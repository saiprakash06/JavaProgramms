package com.qa.coding;

import java.util.HashMap;

public class FindDuplicatesFromStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"sai","prakash","prakash","prakash","prakash","sai","sai"};
		
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		int counter=1;
		
		for(String s : str) {
			
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
				
			}else {
				hm.put(s, 1);
			}
			
			counter=1;
		}
		
		System.out.println(hm);

	}

}
