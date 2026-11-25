package fundamentals;

public class Calculation implements Addition, Multiplication {

	

	@Override
	public void multiply(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c = new Calculation();
		c.add(10, 20);
		c.multiply(6, 7);

	}

}
