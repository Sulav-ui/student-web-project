package fundamentals;

import java.util.HashSet;

public class UniqueStudentIDs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int[] ids = {101, 102, 103, 101, 104, 105, 102, 106};
	     HashSet<Integer> students = new HashSet<>();

	        for (int id : ids) {
	            students.add(id);
	        }
	        
	        System.out.println("Unique IDs: " + students);

	        System.out.println("Total unique students: "
	                           + students.size());
	        if (students.contains(103)) {
	            System.out.println("Student 103 exists");
	        } else {
	            System.out.println("Student 103 not found");
	        }

	}

}
