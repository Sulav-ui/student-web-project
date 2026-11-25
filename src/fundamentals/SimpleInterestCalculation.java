package fundamentals;

public class SimpleInterestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 500000;
        double time = 5;
        double rate = 6.8;

        double interest = principal * time * rate / 100;
        double finalAmount = principal + interest;

        System.out.println("Interest: " + interest);
        System.out.println("Final Amount: " + finalAmount);

	}

}
