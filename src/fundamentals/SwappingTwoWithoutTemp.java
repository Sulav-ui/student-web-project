package fundamentals;

public class SwappingTwoWithoutTemp {

	public static void main(String[] args) {
		// Swapping numbers without temp variable
		 	int a = 7;
	        int b = 8;

	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	}

}
