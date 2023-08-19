package org.datastructure.array;

public class CircularArray {

	public static void main(String[] args) {
		//int arr[] = {12,2,3,5,8,11};
		//int arr[]= {11,12,2,3,5,8};
		int arr[]= {8,11,12,2,4,5};
		int start=0;
		int end=5;
		System.out.println(4%5);
		int size=arr.length;
		while(start<=end) {
			if(arr[start]<=arr[end]) {
				System.out.println(start);
				break;
			}
			int mid=(start+end)/2;
			int next=(mid+1)%size;
			int prev=(mid-1+size)%size;
			
			if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]) {
				System.out.println(mid);
				
				break;
			}else if(arr[mid]<=arr[end]) {
				end=mid-1;
			}else if(arr[mid]>=arr[start]) {
				start=mid+1;
			}
		}
	}

}
