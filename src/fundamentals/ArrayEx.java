package fundamentals;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int j:arr) {
			System.out.println(j);
		}
		

	}

}
