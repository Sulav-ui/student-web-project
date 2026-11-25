package fundamentals;

public class StringBufferExample {

	public static void main(String[] args) {
		
		 StringBuffer sb = new StringBuffer();

	        System.out.println(sb.length());
	        System.out.println(sb.capacity());

	        sb.append("Hello");

	        System.out.println(sb.length());
	        System.out.println(sb.capacity());
	        
	        sb.insert(6, "Java ");
	        System.out.println(sb);

	}

}
