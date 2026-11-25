package fundamentals;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Double
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Float
        System.out.print("Enter your height: ");
        float height = sc.nextFloat();

        // Character
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        // String
        sc.nextLine(); // Consume leftover newline
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        // Boolean
        System.out.print("Are you a student (true/false): ");
        boolean student = sc.nextBoolean();

        // Long
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        System.out.println("\n--- Your Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + student);
        System.out.println("Phone: " + phone);

        sc.close();

	}

}
