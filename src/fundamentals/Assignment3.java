package fundamentals;

import java.util.Arrays;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

	        numbers.stream()
	               .filter(n -> n % 2 != 0)
	               .forEach(System.out::println);

	}

}
