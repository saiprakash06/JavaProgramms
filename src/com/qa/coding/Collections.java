package com.qa.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {

	public static void main(String[] args) {

		List<Object> ls = new ArrayList();

		ls.add("Sai");

		ls.add("Sai");

		ls.add("Sai");
		ls.add("Sai");

		ls.add(2);

		System.out.println(ls);

		List j = ls.stream().distinct().collect(Collectors.toList());

		System.out.println(j);

		Set s = new HashSet();

		System.out.println(s);
		
		
		HashMap<String,String> Hm = new HashMap();
		
		Hm.put("Sai", "sdfsdf");
		Hm.put("Sushma", "Swaraj");
		
		
		
		Set<Map.Entry<String,String>> kj=Hm.entrySet();
		
		
		
		for (Map.Entry<String, String> h : Hm.entrySet()) {
			
			System.out.println(h.getKey()+h.getValue());
		}
			
		
		Integer i = new Integer(10);
		
		Integer i2 =10;
			
		
		
		

	}

}
