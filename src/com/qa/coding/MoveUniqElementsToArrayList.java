package com.qa.coding;

import java.util.ArrayList;

public class MoveUniqElementsToArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(8);
		list1.add(10);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(4);

		//ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
		// list3.retainAll(list2); // will give common elements from 2 array list [1,2]
		// System.out.println(list3);

		// list3.removeAll(list2); // will give unique elements from 2 array list
		// [3,8,10]
		// System.out.println(list3);

		// Traditional Way
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (Integer i : list1) {
			if (list2.contains(i)) {

			} else {
				list3.add(i);
			}
		}
		
		System.out.println(list3);

	}

}
