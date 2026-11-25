package fundamentals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number to check: ");
	      int number = sc.nextInt();
	      
	      if(number%2==0) {
	    	  System.out.println(number + "the number is even");
	      }
	      else {
	    	  System.out.println(number + "the number is odd");
	      }
	      sc.close();
				

	}

}
