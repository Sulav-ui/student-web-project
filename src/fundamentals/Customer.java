package fundamentals;

public class Customer {
	  int cno;
	    String cname;
	    String cadd;
	    String cemail;

	    public Customer(int cno, String cname, String cadd, String cemail) {
	        this.cno = cno;
	        this.cname = cname;
	        this.cadd = cadd;
	        this.cemail = cemail;
	    }

	    public void display() {
	        System.out.println("Customer No: " + cno);
	        System.out.println("Customer Name: " + cname);
	        System.out.println("Customer Address: " + cadd);
	        System.out.println("Customer Email: " + cemail);
	        System.out.println("----------------------");
	    }

}
