package session4;

import session4.task2.Node;

public class main {
	Node head;
	Node tail;
  
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int val){
			data=val;
			next=null;
			prev=null;

}
	class LinkedList	{
		Node head;
		public void append(int data) {
			Node newNode = new Node(data);
			if( head == null) {
				head = newNode;
				return;
			}
			Node current = head;
			While (current.next != null); {
				current = current.next;
			}
			current.next = newNode;
	}
		private void While(boolean b) {
			
			
		}
		
}
	public void insertAtMiddle(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
	}
	
		
	}
}
