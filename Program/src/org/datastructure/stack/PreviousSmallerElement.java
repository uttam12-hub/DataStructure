package org.datastructure.stack;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		
		int [] arr= {4,10,5,18,3,12,7};
		Stack<Integer> s=new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && s.peek()>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				System.out.print(-1 +" ");
				
			}else {
				System.out.print(s.peek() + " ");
			}
			
			s.push(arr[i]);
		}
	}

}
