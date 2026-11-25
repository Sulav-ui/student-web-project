package fundamentals;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Heloo World!";
		int count = 0;
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("The number of vowels is: " +count);

	}

}
