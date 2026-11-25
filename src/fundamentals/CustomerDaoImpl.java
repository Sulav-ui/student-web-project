package fundamentals;

public class CustomerDaoImpl implements CustomerDao{
	Customer[] customers = new Customer[3];

	@Override
	public void addCustomers() {
		// TODO Auto-generated method stub

        customers[0] = new Customer(101, "John", "New York", "john@gmail.com");
        customers[1] = new Customer(102, "David", "Dallas", "david@gmail.com");
        customers[2] = new Customer(103, "Smith", "Chicago", "smith@gmail.com");

        System.out.println("Customers added successfully");
		
	}

	@Override
	public Customer[] viewAllCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public Customer viewCustomer() {
		// TODO Auto-generated method stub
		 return customers[0];
	}

}
