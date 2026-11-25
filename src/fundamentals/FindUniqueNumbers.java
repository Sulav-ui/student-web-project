package fundamentals;

import java.util.HashSet;

public class FindUniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {1, 2, 3, 2, 4, 1, 5};

	        HashSet<Integer> set = new HashSet<>();

	        for (int num : numbers) {
	            set.add(num);
	        }

	        System.out.println("Unique numbers: " + set);
	        System.out.println("Total unique numbers: " + set.size());
	    }

}
