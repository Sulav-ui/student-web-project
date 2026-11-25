package fundamentals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> employees = new LinkedList<>(
		            Arrays.asList("John", "David", "Ram", "Shyam",
		                          "Hari", "Alex", "Emma", "Sam",
		                          "Robert", "James")
		        );
		        // Add at beginning
		        employees.addFirst("Jack");

		        // Add at end
		        employees.addLast("Peter");

		        System.out.println(employees);

		        // Remove first employee
		        employees.removeFirst();

		        // Remove last employee
		        employees.removeLast();

		        // Retrieve first and last employees
		        System.out.println("First: " + employees.getFirst());
		        System.out.println("Last: " + employees.getLast());

		        // Display all employees
		        Iterator<String> itr = employees.iterator();

		        while (itr.hasNext()) {
		            System.out.println(itr.next());
		        }

	}

}
