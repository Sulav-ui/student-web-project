package fundamentals;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Emp implements Cloneable {
    String name;
    Address address;

    Emp(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Emp clone() throws CloneNotSupportedException {
        return (Emp) super.clone();
    }
}

public class Main {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Emp s1 = new Emp("John", new Address("New York"));

        Emp s2 = s1.clone();

        s2.address.city = "Dallas";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}