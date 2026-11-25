package fundamentals;

import java.util.HashSet;

public class CommonStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> classA = new HashSet<>();
        classA.add("Ram");
        classA.add("Hari");
        classA.add("Sita");
        classA.add("John");

        HashSet<String> classB = new HashSet<>();
        classB.add("Hari");
        classB.add("Sita");
        classB.add("Alex");
        classB.add("Sam");
        
        classA.retainAll(classB);
        System.out.println("Common students: " + classA);

	}

}
