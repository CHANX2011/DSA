package session1;

import java.util.Arrays;

public class task2 {
	public static void main(String[]args) {
		int[] arr = {1,2,3,5,7,8,9,22};
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Min:"+ min);
        System.out.println("max:"+max);
	}

}
