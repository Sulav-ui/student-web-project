package fundamentals;

public class PizzaBillCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	double pizzaPrice = 399;
	        int quantity = 2;

	        double total = pizzaPrice * quantity;
	        double discount = total * 20 / 100;
	        double finalBill = total - discount;

	        System.out.println("Total: " + total);
	        System.out.println("Discount: " + discount);
	        System.out.println("Final Bill: " + finalBill);
	    }
	

}
