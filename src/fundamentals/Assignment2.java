package fundamentals;

import java.util.Arrays;
import java.util.List;

public class Assignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(10, 60, 30, 80, 45, 90, 25);
		 
		 numbers.stream().filter(n->n>50)
		 .forEach(System.out::println);

	}

}
