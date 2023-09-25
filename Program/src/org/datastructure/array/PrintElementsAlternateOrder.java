package org.datastructure.array;
//Q4. You are given an array A of size N. You need to print elements of A in alternate order (starting
//from index 0).
//Example 1:
//Input:
//N = 4
//A[] = {1, 2, 3, 4}
//Output:
//1 3


public class PrintElementsAlternateOrder {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		PrintElementsAlternateOrder alternateOrder=new PrintElementsAlternateOrder();
		alternateOrder.displayElementsAlternateOrder(arr);
	}
	
	public void displayElementsAlternateOrder(int [] arr) {
		System.out.print("Output:");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(" "+arr[i]);
		}
	}

}
