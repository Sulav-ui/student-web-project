package fundamentals;

import java.util.Scanner;

public class ArrayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter number: ");
			arr[i]=sc.nextInt();
			
		}
		 System.out.println("Even numbers:");

	        for (int i = 0; i < arr.length; i++) {
	            if(arr[i]%2==0) {
	            	System.out.println(arr[i]);
	            }
	        }

	        sc.close();
		

	}

	}


