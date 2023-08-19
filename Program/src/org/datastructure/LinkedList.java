package org.datastructure;

public class LinkedList {

	 Node head;
	
	static class Node {
		private int data;
		private Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		
	}
	
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.head=new Node(0);
		Node second=new Node(5);
		Node third=new Node(3);
		Node four=new Node(10);
		
		
		
		ll.head.next=second;
		second.next=third;
		third.next=four;
		
	
		
//		Node current=ll.head;
//		while(current!=null) {
//			System.out.print(current.data + " ");
//			current=current.next;
//		}
		
		// add node before head i.e first place 
		Node first=new Node(1);
		first.next=ll.head;
		ll.head=first;
		
		// add node at the end 
		
		Node last=new Node(100);
		
		if(ll.head==null) {
			ll.head=last;
		}else {
			Node current1=ll.head;
			while(current1.next!=null) {
				current1=current1.next;
			}
			current1.next=last;
		}
		
		// insert node in any position
		
		ll.insertInAnyPosition(200, 7);
		
		// delete first node 
		ll.deleteFirstNode();
		
		// delete last node
		ll.deleteLastNode();
		// print node 
		Node current2=ll.head;
		while(current2!=null) {
			System.out.print(current2.data + " ");
			current2=current2.next;
		}
	}
	
	
	public void insertInAnyPosition(int data, int position) {
		Node node=new Node(data);
		if(position==1) {
			node.next=head;
			head=node;
		}else {
			int count=1;
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
	
	public void deleteFirstNode() {
		
		if(head==null) {
			System.out.println("Node is not exist");
		}else {
			Node temp=head;
			head=head.next;
			temp.next=null;
			
			System.out.println("first node deleted "+temp.toString());
		
		}
		
	}
	
	public void deleteLastNode() {
		
		if(head==null || head.next==null) {
			System.out.println("deleted");
		}else {
			Node current=head;
			Node previous=null;
			while(current.next!=null) {
				previous=current;
				current=current.next;
			}
			
			previous.next=null;
			
			System.out.println("last node "+current.toString() + " deleted");
		}
	}

}
