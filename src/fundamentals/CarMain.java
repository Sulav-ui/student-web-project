package fundamentals;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cars = new ArrayList<>();
		
		cars.add(new Car(101, "Toyota", 25000, 2022));
        cars.add(new Car(102, "Honda", 22000, 2024));
        cars.add(new Car(103, "BMW", 55000, 2023));
        cars.add(new Car(104, "Audi", 45000, 2021));
        
        // Comparable - Sort by Price
        Collections.sort(cars);
        
        System.out.println("Sorting by Price:");
        for (Car c : cars) {
            System.out.println(c);
        }

        // Comparator - Sort by Name
        Collections.sort(cars, new Car());

        System.out.println("\nSorting by Name:");
        for (Car c : cars) {
            System.out.println(c);
        }

		

	}

}
