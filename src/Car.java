
public class Car {
	// instance variables
	private String make;
	private String model;
	private int year;
	private double price;
	private String $;
	
	public Car() {
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Car (String carMake, String carModel, int carYear, double carPrice) {
		this.make = carMake;
		this.model = carModel;
		this.year = carYear;
		this.price = carPrice;
		this.$ = "$";
	}
	
	// formatted the string with the toString method
	public String toString() {
		return String.format("%1$-15s %2$-10s %3$-6d %4$-1s %5$-10.2f \n", make, model, year, $, price);
	}

}
