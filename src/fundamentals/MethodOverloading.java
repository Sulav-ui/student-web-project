package fundamentals;

public class MethodOverloading {
	  // Method with 2 integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    static double add(double a, double b) {
        return a + b;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5, 20.5));

	}

}
