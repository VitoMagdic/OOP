package vjezba4;

public class Dessert {

	protected String name;
	protected double weight;
	protected int calories;
	
	public Dessert(String n, double w, int c) {
		name = n;
		weight = w;
		calories = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return String.format("Name : %s \nWeight : %f \nCalories : %d", name, weight, calories);
	}
	
	public String getDessertType() {
		return "dessert";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
