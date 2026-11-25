package fundamentals;

public class SalaryTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   	double salary = 85000;

	        double tax = salary * 20 / 100;
	        double finalSalary = salary - tax;

	        System.out.println("Tax Amount: " + tax);
	        System.out.println("Final Salary: " + finalSalary);

	}

}
