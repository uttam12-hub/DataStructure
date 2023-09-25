package org.datastructure.array;
//Q5. Given an array Arr of N positive integers. Your task is to find the elements whose value is equal
//to that of its index value ( Consider 1-based indexing ).
//Example 1:
//Input:
//N = 5
//Arr[] = {15, 2, 45, 12, 7}
//Output: 2
public class ElemetEqualToIndexValue {

	public static void main(String[] args) {
		int arr[] = {15, 2, 45, 12, 7};
		ElemetEqualToIndexValue obj=new ElemetEqualToIndexValue();
		obj.checkElementEqualToIndexValue(arr);
	}

	public void checkElementEqualToIndexValue(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i+1) {
				System.out.print(" "+arr[i]);
			}
		}
	}

}
