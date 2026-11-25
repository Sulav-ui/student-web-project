package fundamentals;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(40);
		
		 Iterator<Integer> itr = hs.iterator();

	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
		

	}

}
