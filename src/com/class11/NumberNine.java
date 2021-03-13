package com.class11;

public class NumberNine {

	public static void main(String[] args) {
		
		int[] nums= {10, 20, 30, 40, 50, 90, 25, 90, 35, 45, 55, 112, 134};
		int max=0, maxTwo=0;
		
		for (int i = 0; i<nums.length; i++) {
			if(nums[i] > max) {
					maxTwo=max;
					max=nums[i];
			}else if (nums[i] > maxTwo && nums[i]!=max) {
				maxTwo=nums[i];
			}
		}
		System.out.println(maxTwo + " is the second largest number");
	}
}