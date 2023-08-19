package org.datastructure.linklist;

import org.datastructure.linklist.LinkedList.Node;

public class SinglyLinklist {

	 Node head;
	 
	  class Node{
		 int data;
		 Node next;
		 
		 Node(int data){
			 this.data=data;
			 this.next=null;
		 }
	 }
	
	public static void main(String[] args) {
		SinglyLinklist sll=new SinglyLinklist();
		
		sll.head=sll.new Node(10);
		
		//Node second =sll.new Node(20);
		
//		if(sll.head.next==null) {
//			sll.head.next=second;
//		}
		
		//add node in the last
		sll.addNode(30);
		sll.addNode(40);
		sll.addNode(50);
		sll.addNode(30);
		
		sll.display(sll);
		
		sll.addNode(100, 8);
		System.out.println("");
		sll.display(sll);
	}
	
	public void addNode(int data) {
		Node node=new Node(data);
		
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=node;
		
	}
	
	public void addNode(int data,int position) {
		Node node=new Node(data);
		int count=1;
		
		if(position==1) {
			node.next=head;
			head=node;
		}else {
			Node previous=head;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			Node current=previous.next;
			previous.next=node;
			node.next=current;
		}
		
	}
	
	public void display(SinglyLinklist sll) {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
	}

}
