package org.datastructure.array;
//Q2. Given an array A[] of N integers and an index Key. Your task is to print the element present at
//index key in the array.
//Example 1:
//Input:
//5 2
//10 20 30 40 50
//Output:
//30
	
public class ElementAtIndexKey {

	public static void main(String[] args) {
		int arr[]= {10, 20 ,30, 40 ,50};
		int key=2;
		ElementAtIndexKey elementAtIndexKey=new ElementAtIndexKey();
		elementAtIndexKey.printElement(arr, key);

	}
	
	public void printElement(int [] arr,int key) {
		System.out.println("Output:"+arr[key]);
	}

}
