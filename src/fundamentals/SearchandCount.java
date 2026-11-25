package fundamentals;

import java.util.*;


public class SearchandCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> numbers = new ArrayList<>(
		            Arrays.asList(10, 20, 30, 20, 40, 50, 20, 60, 70, 20)
		        );
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Numbers: " + numbers);
	      System.out.print("Enter a number to search: ");
	      int search = sc.nextInt();
	      
	   // Search number
	      System.out.println("Found: " + numbers.contains(search));
	      
	      // Count occurrences
	      System.out.println("Count: " + Collections.frequency(numbers, search));
	      
	      int count =0;
	      Iterator<Integer> itr = numbers.iterator();
	      
	      while(itr.hasNext()) {
	    	  if(itr.next()==search) {
	    		  System.out.println("Found at index: " + count);
	    	  }
	    	  count++;
	      }
	}

}
