package fundamentals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SearchEmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> employees = new HashSet<>();

        employees.add("John");
        employees.add("Alex");
        employees.add("David");
        employees.add("Sam");
        employees.add("Michael");
        employees.add("Ram");
        employees.add("Hari");
        employees.add("Sita");
        employees.add("Peter");
        employees.add("James");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Iterator<String> itr = employees.iterator();
        
        if (employees.contains(name)) {
            System.out.println("Employee exists");
        } else {
            System.out.println("Employee not found");
        }

        sc.close();    
	}

}
