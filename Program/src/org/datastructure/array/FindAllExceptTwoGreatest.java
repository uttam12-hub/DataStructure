package org.datastructure.array;

import java.util.Arrays;

//Q8. Given an array of N distinct elements, the task is to find all elements in array except two greatest
//elements in sorted order.
//Example 1:
//Input :
//a[] = {2, 8, 7, 1, 5}
//Output :
//1 2 5
//Explanation :
//The output three elements have two or
//more greater elements.

public class FindAllExceptTwoGreatest {

	public static void main(String[] args) {
		int arr[]={2, 8, 7, 1, 5};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
