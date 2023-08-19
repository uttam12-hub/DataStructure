package org.datastructure.array;

public class FirstOccurence {

	public static void main(String[] args) {

		int arr[]= {10,10,10,10,10,10,11,12,13,14};
		
		int start=0;
		int end=10;
		int result=-1;
		int x=10;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(x==arr[mid]) {
				result=mid;
				//end=mid-1;
				start=mid+1; // last occurrence
			}else if(x>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		System.out.println(result);
	}

}
