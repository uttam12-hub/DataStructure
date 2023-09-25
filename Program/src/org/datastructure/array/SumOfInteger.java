package org.datastructure.array;

//Q1. Given an array of N integers. Your task is to print the sum of all of the integers.
//Example 1:
//Input:
//4
//1 2 3 4
//Output:
//10
public class SumOfInteger {
	
	public void sum(int[] arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Output :"+sum);
	}

	public static void main(String[] args) {
		int arr[]= {1, 2 ,3 ,4};
		int n=arr.length;
		
		SumOfInteger sumOfInterger=new SumOfInteger();
		sumOfInterger.sum(arr, n);

	}

}
