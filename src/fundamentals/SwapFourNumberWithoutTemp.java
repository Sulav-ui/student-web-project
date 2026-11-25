package fundamentals;

public class SwapFourNumberWithoutTemp {

	public static void main(String[] args) {
		// Swapping four numbers without temp variable
	     	int a = 10;
	        int b = 20;
	        int c = 30;
	        int d = 40;

	        System.out.println("Before Swapping:");
	        System.out.println(a + " " + b + " " + c + " " + d);

	        a = a + b;
	        b = a - b;
	        a = a - b;

	        b = b + c;
	        c = b - c;
	        b = b - c;

	        c = c + d;
	        d = c - d;
	        c = c - d;

	        System.out.println("After Swapping:");
	        System.out.println(a + " " + b + " " + c + " " + d);

	}

}
