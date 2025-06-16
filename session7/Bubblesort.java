package session7;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
	

	public static void findbubble(int [] sample) {
		System.out.println(Arrays.toString(sample));
	
		for(int i=1;i<sample.length;i++) {
			for( int j=0;j<sample.length-1;j++)
			{
				if(sample[j]>sample[j+1])
				{
					int temp =sample[j];
					sample[j]= sample[j+1];
					sample[j+1] =temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(sample));
}
		public static void main(String[]args) {
			int[]arr = new int[6];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value");
			for(int k=0;k<arr.length;k++) {
				arr[k]=sc.nextInt();
				
			}
			findbubble(arr);
		}


  

}
