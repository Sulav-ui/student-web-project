package fundamentals;

import java.util.*;


public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> numbers = new ArrayList<>(
		            Arrays.asList(10, 45, 30, 70, 25, 90, 15, 60, 80, 35)
		        );
		 Collections.sort(numbers);
		 System.out.println("Largest: " + numbers.get(numbers.size() - 1));
	     System.out.println("Second Largest: " + numbers.get(numbers.size() - 2));
	     int sum = 0;
		 Iterator<Integer> itr = numbers.iterator();
		 while(itr.hasNext()) {
			
			 sum += itr.next();
		 }
		   System.out.println("Sum: " + sum);
	       System.out.println("Average: " + (double) sum / numbers.size());
	}

}
