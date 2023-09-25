package org.datastructure.array;

public class MinOf3Element {

	public static void main(String[] args) {
		int []nums= {2,5,1};
		long min=Long.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(min>nums[i]) {
				min=nums[i];
			}
		}
		System.out.println(min);

	}

}
