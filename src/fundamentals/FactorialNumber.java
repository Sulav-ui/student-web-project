package fundamentals;

public class FactorialNumber {
	
	public static int Factorial(int b) {
		
	        int result = 1;
	        for (int i = 1; i <= b; i++) {
	            result *= i;
	        }
	        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial(10);

	}

}
