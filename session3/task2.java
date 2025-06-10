package session3;

import java.util.Scanner;

public class task2 {
	
	    public static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public static void insertAtPosition(int position, int data, int pos) {
	        Node newNode = new Node(data);

	        Node head = null;
			if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
			}
			Node current = head;
			int count1 =0;
			
			while(current != null && count1 < position - 1) {
				current = current.next;
				count1++;
			}
			if(current == null) {
				System.out.println("position out of range ");
				return;
				
			}
			newNode.next = current.next;
			current.next = newNode;
	    }
			
	    
			  public static void display() {

			        Node head = null;
					Node current = head;

			        System.out.print("Linked List: ");

			        while (current != null) {

			            System.out.print(current.data + " -> ");

			            current = current.next;



			        }

			        System.out.println("null");

			    }

			    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        insertAtPosition(10, 0);
		        insertAtPosition(20, 1);
		      insertAtPosition(30, 2);
			        display();
        System.out.print("Enter value to insert: ");
			        int value = sc.nextInt();
			        System.out.print("Enter position to insert: ");
			       int pos = sc.nextInt();
			        insertAtPosition(value, pos, pos);
			        display();
			    }


				private static void insertAtPosition(int i, int j) {
					// TODO Auto-generated method stub
					
				}


	    
	    }


