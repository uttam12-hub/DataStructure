package org.datastructure.array;

public class MaxOf3Element {

	public static void main(String[] args) {
		int []nums= {2,5,1};
		long max=Long.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
			}
		}
		System.out.println(max);
	}

}
