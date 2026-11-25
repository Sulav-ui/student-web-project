package fundamentals;

public class SalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	double basicSalary = 85000;

	        double ta = basicSalary * 15 / 100;
	        double da = basicSalary * 20 / 100;
	        double hra = basicSalary * 18 / 100;

	        double pf = basicSalary * 20 / 100;
	        double tax = basicSalary * 25 / 100;

	        double grossSalary = basicSalary + ta + da + hra;
	        double netSalary = grossSalary - (pf + tax);

	        System.out.println("Gross Salary: " + grossSalary);
	        System.out.println("Net Salary: " + netSalary);

	}

}
