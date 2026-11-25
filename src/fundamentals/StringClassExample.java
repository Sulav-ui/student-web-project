package fundamentals;

public class StringClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = new String("Sulav");
		String st1 = new String("Sulav");
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		
		System.out.println("Abcdefghi".length());
		System.out.println("Abcdefghi".charAt(0));
		System.out.println("Abcdefghi".substring(3));
		System.out.println("Abcdefghi".substring(3, 7));
		System.out.println("Abcdefghi".lastIndexOf('g'));
		System.out.println("Abcdefghi".replaceFirst("a", "d"));
		System.out.println("Abcdefghi".replace('a', 'l'));
		System.out.println("Abcdefghi".startsWith("a"));
		System.out.println("Abcdefghi".endsWith("i"));
		System.out.println("  Abcdefghi  ".trim());
		
	}

}
