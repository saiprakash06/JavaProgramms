package com.qa.coding;

public class ReverseSentencewithout_PositionChage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "my name is sai praskash";
		// output = "ym eman si ias hsakarp";

		String[] arr = input.split(" ");

		String temp = "";

		String finalReveserSrign = "";
		for (String s : arr) {
			// System.out.println(s);
			// int i =0;i<=s.length();i++
			for (int i = s.length() - 1; i >= 0; i--) {

				char word = s.charAt(i);

				temp = temp + word;

			}

			temp = temp + " ";

		}

		System.out.println(temp);

	}

}
