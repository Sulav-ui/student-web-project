package fundamentals;

public class SwapThreeVariable {

	public static void main(String[] args) {
		// Swapping three variables using temp variable
		  	int a = 10;
	        int b = 20;
	        int c = 30;

	        System.out.println("Before Swapping:");
	        System.out.println(a + " " + b + " " + c);

	        int temp = a;
	        a = b;
	        b = c;
	        c = temp;

	        System.out.println("After Swapping:");
	        System.out.println(a + " " + b + " " + c);

	}

}
