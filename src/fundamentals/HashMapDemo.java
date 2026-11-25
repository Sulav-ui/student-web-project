package fundamentals;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hs = new HashMap<>();

        hs.put(10, 20);
        hs.put(7, 2);
        hs.put(5, 20);
        hs.put(1, 20);
        hs.put(7, 20);
        hs.put(null, null);
        hs.put(13, null);

        System.out.println(hs);

        Set<Integer> keySet = hs.keySet();
        System.out.println(keySet);

        Collection<Integer> values = hs.values();
        System.out.println(values);

        for (Map.Entry<Integer, Integer> k : hs.entrySet()) {
            System.out.println(k.getKey() + "\t" + k.getValue());
        }

	}

}
