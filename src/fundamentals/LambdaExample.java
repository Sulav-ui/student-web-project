package fundamentals;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = ()->{System.out.println("Addition of two number is"+ (100+200));
		};
		add.add();
		
		Subtraction s = (int a, int b)->{
			System.out.println("Subtraction of two number is "+ (a-b));
		};
		s.sub(20, 10);
		
		Multiple mul =(int x, int y)->{
			return x*y;
		};
		
		int result = mul.multiply(20, 30);
		
		System.out.println("Subtraction of two number is "+ result);
		

	}

}
