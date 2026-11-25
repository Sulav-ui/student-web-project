package fundamentals;

public class Employee1 {
	
	  static int calculateSalary(int basicSalary) {
	        return  basicSalary;
	    }
	  
	  static int calculateSalary(int basicSalary, int bonus) {
		  	basicSalary+=bonus;
	        return  basicSalary;
	    }
	  static int calculateSalary(int basicSalary, int bonus, int allowance) {
		  	int totalSalary = basicSalary+ bonus + allowance;
	        return  totalSalary;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateSalary(1000));
		System.out.println(calculateSalary(1000, 200));
		System.out.println(calculateSalary(1000,200, 80));
		

	}

}
