package org.datastructure.array;
//Q6. Given an array of size N and you have to tell whether the array is perfect or not. An array is said
//to be perfect if it's reverse array matches the original array. If the array is perfect then print
//"PERFECT" else print "NOT PERFECT".
//Example 1:
//Input : Arr[] = {1, 2, 3, 2, 1}
//Output : PERFECT
//Explanation:
//Here we can see we have [1, 2, 3, 2, 1]
//if we reverse it we can find [1, 2, 3, 2, 1]
//which is the same as before.
//So, the answer is PERFECT.
public class CheckArrayIsPerfect {

	public static void main(String[] args) {
		int  arr[] = {1, 2, 3, 2,1};
		boolean isPerfect=true;
		int reverIndexCount=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[reverIndexCount]) {
				isPerfect=false;
				break;
			}
			reverIndexCount--;
		}
		if(isPerfect) {
			System.out.println("PERFECT");
		}else {
			System.out.println("Not PERFECT");
		}

	}

}
