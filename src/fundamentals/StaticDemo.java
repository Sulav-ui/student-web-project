package fundamentals;

public class StaticDemo {
	
	static int num=20;
	
	static void hey() {
		System.out.println("Here there!!!");
	}

	public static void main(String[] args) {
		// Calling static variables and methods 
		
		System.out.println("The static number is : "+num);
		hey();
		
		StaticDemo st = new StaticDemo();
		System.out.println(st.num);
		st.hey();
		
		StaticDemo st1 = null;
		System.out.println(st1.num);
		st1.hey();
	}
}
