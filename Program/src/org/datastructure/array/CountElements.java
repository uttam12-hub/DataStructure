package org.datastructure.array;

//Q3. Given an sorted array A of size N. Find number of elements which are less than or equal to given
//element X.
//Example 1:
//Input:
//N = 6
//A[] = {1, 2, 4, 5, 8, 10}
//X = 9
//Output:
//5

public class CountElements {

	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 5, 8, 10};
		int x=9;
		CountElements countElements=new CountElements();
		countElements.numberOfElements(arr,x);
	}
	
	public void numberOfElements(int arr[],int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=x) {
				count++;
			}
		}
		System.out.println("Output:"+count);
	}

}
