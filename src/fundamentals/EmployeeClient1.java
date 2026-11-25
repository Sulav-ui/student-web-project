package fundamentals;

public class EmployeeClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EmployeeDao dao = new EmployeeDaoImpl();

	        dao.addEmployee();
	        dao.viewEmployee();

	}

}
