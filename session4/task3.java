package session4;

import session4.task2.Node;

public class task3 {
	Node head;
	Node tail;
	private Object temp;
  
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int val){
			data=val;
			next=null;
			prev=null;
		}
	}
	public task3() {
		head=null;
		tail=null;
		
	}
	public void add(int val) {
		Node newNode=new Node(val);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}

	}
	public void deleteAtPosition(int pos) {

        if (head == null) return;



        if (pos == 0) {

            head = head.next;

            if (head != null) head.prev = null;

            else tail = null;

            return;

        }



        Node temp = head;

        for (int i = 0; i < pos && temp != null; i++) {

            temp = temp.next;

        }



        if (temp == null) return;



        if (temp.prev != null) temp.prev.next = temp.next;

        if (temp.next != null) temp.next.prev = temp.prev;

        if (temp == tail) tail = temp.prev;

    }
		public void Display() {
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
			public void Displayprev() {
				Node temp=tail;
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.prev;
				}
				System.out.println();
		
	}
		public static void main(String []args) {
			task3 ch=new task3();
			ch.add(10);
			ch.add(20);
			ch.add(30);
			ch.add(40);
			ch.add(50);
			System.out.print("the number before delete:");
			ch.Display();
			ch.deleteAtPosition(3);
			System.out.print("the number after delete:");
			ch.Display();
		

	



}
}