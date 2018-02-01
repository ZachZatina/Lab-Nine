import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<Car> carList = new ArrayList<>();
		
		
		System.out.println("Welcome to this car app.");
		System.out.println("========================");
		
		int numCars = Validator.getInt(scnr, "How many cars are you entering: ", 1, 100000);
		System.out.println("");
		
		for (int i = 0; i < numCars; i++) {
			String make = Validator.getString(scnr, "Enter Car #" + (i + 1) + " Make: ");
			String model = Validator.getString(scnr, "Enter Car #" + (i + 1) + " Model: ");
			int year = Validator.getInt(scnr, "Enter Car #" + (i + 1) + " Year: ", 0, 3000);
			double price = Validator.getDouble(scnr, "Enter Car #" + (i + 1) + " Price: ", 0.0, 100000000.0);
			System.out.println("");
			Car carInfo = new Car(make, model, year, price);
			carList.add(carInfo);
			
		}
		
		System.out.println("");
		System.out.println("Current Inventory:");
		
		for (int j = 0; j < numCars; j++) {
			System.out.println(carList.get(j));
		}
		
		scnr.close();
		
	}

}
