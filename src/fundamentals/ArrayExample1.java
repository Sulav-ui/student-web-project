package fundamentals;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter number: ");
			arr[i]=sc.nextInt();
			
		}
		 System.out.println("Array elements:");

	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }

	        sc.close();
		

	}

}
