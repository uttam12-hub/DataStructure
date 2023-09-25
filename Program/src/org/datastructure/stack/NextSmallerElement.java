package org.datastructure.stack;

import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {
		int [] arr= {4,10,5,18,3,12,7};
		
		Stack<Integer> s=new Stack<>();
		
		int n=arr.length-1;
		
		for(int i=n;i>=0;i--) {
			while(!s.isEmpty() && s.peek()>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				System.out.print(-1 + " ");
			}else {
				System.out.print(s.peek()+ " ");
			}
			
			s.push(arr[i]);
		}
	}

}
