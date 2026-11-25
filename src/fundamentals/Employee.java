package fundamentals;

public class Employee {
	//non-static variables or instance variables
	int sno=80;
	String name="Sulav";
	
	void display() {
		System.out.println(sno+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		
		System.out.println(e.sno);
		e.display();

	}

}
