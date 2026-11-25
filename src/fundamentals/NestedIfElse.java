package fundamentals;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        System.out.print("Are you a citizen (true/false): ");
	        boolean citizen = sc.nextBoolean();

	        if (age >= 18) {
	            if (citizen) {
	                System.out.println("You are eligible to vote.");
	            } else {
	                System.out.println("You must be a citizen to vote.");
	            }
	        } else {
	            System.out.println("You are under 18.");
	        }

	        sc.close();

	}

}
