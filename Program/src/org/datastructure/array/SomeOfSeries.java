package org.datastructure.array;

public class SomeOfSeries {

	public static void main(String[] args) {
		int n=5;
		int sum=n*(n+1)/2;
		System.out.println(sum);
		
		//or
		int sum1=0;
		for(int i=1;i<=n;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
	}

}
