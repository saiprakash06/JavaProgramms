package com.qa.coding;

public class LargestandSmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,8,7,4};
		
		int largestNum=num[0];
		int smallestNum=num[0];
		
		
		for(int i=0;i<=num.length-1;i++) {
			
			if(num[i]<smallestNum) {
				smallestNum=num[i];
			}else if(num[i]>largestNum) {
				largestNum=num[i];
				
			}
		}
		
		
		System.out.println(smallestNum);
		System.out.println(largestNum);

	}

}
