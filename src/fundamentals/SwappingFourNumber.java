package fundamentals;

public class SwappingFourNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =20;
		int c= 30;
		int d= 40;
		
		System.out.println("Before swapping the values of a and b is:"+a+ "," +b+ "," +c+","+d);
		int e=a;
		a=b;
		b=c;
		c=d;
		d=e;
		
		System.out.println("After swapping the values of a and b is:"+a+ "," +b+"," + "," +c+","+d);

	}

}
