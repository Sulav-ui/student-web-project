package fundamentals;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter number: ");
			arr[i]=sc.nextInt();
			
		}
		 int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if(arr[i]>max) {
	            	max = arr[i];
	            }
	        }
	        System.out.println("The max number in array is: "+max);

	        sc.close();
		

	}

}
