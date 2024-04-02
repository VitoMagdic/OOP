package vjezba4;

public class IceCream extends Dessert {

	public IceCream(String n, double w, int c) {
		super(n, w, c);
		// TODO Auto-generated constructor stub
	}



	private String flavour, color;
	
	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("Name : %s \nWeight : %f \nCalories : %d \n Flavour : %b \n Color : %s", name, weight, calories, flavour, color);
	}

	public String getDessertType() {
		return "ice cream";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
