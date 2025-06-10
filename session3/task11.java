package session3;

public class task11 {
    public Node head;

   public static class Node {
       int data;
         Node next;

        Node(int val) {
           data = val;
           next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void traverseIterative() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task11 list = new task11();
        System.out.println("inserted numbers:");
        list.add(10);
        list.add(20);
        list.add(30);
        list.traverseIterative();
    }
}
