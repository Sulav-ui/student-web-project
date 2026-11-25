package fundamentals;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(3);
		al.add(10);
		al.add(20);
		al.add(3);
		
		for(int i=0; i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}
			
			
			System.out.println(al);
		}

	}

}
