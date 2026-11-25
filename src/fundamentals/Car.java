package fundamentals;

import java.util.Comparator;

public class Car implements Comparable<Car>, Comparator<Car> {
	private int carId;
    private String carName;
    private double price;
    private int year;

    // Default Constructor
    public Car() {
    }

    // Parameterized Constructor
    public Car(int carId, String carName, double price, int year) {
        this.carId = carId;
        this.carName = carName;
        this.price = price;
        this.year = year;
    }

    // Getters and Setters

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Comparable - Sort by Price
    @Override
    public int compareTo(Car c) {
        return Double.compare(this.price, c.getPrice());
    }

    // toString Method
    @Override
    public String toString() {
        return carId + " " + carName + " " + price + " " + year;
    }

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
