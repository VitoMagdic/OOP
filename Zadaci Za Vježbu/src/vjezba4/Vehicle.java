package vjezba4;

public class Vehicle {

	private String regNo, model;
	private int year;
	private double price;
	
	public Vehicle(String reg, String mod, int y, double p) {
		this.regNo = reg;
		this.model = mod;
		this.year = y;
		this.price = p;
	}
	
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
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

	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
