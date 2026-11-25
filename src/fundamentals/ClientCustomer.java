package fundamentals;

public class ClientCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CustomerDao dao = new CustomerDaoImpl();

	        // Add customers
	        dao.addCustomers();

	        // View all customers
	        System.out.println("\nAll Customers:");

	        Customer[] customers = dao.viewAllCustomers();

	        for (Customer c : customers) {
	            c.display();
	        }

	        // View single customer
	        System.out.println("\nSingle Customer:");

	        Customer customer = dao.viewCustomer();
	        customer.display();

	}

}
