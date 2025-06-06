package session1;
import java.util.ArrayList;
import java.util.Arrays;
public class task1 {
	
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
	        int element = 99;
	        int position = 3;

	        System.out.println("Original list: " + list);
	        list.add(position, element);
	        System.out.println("List after insertion: " + list);
	    }
	}



