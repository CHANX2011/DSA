package session4;

public class task2 {
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
	}
	public task2() {
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
			task2 ch=new task2();
			ch.add(10);
			ch.add(20);
			ch.add(30);
			ch.add(40);
			ch.add(50);
			System.out.print("the added numbers are:");
			ch.Display();
			System.out.print("the added numbers in reverse:");
			ch.Displayprev();
		}

}
