package vjezba3;

public class FoodType {

	private String name;
	private int protein, carbs, fat;
	private int counter = 0;
	
	public FoodType(String n, int p, int c, int f) {
		name = n;
		protein = p;
		carbs = c;
		fat = f;
		counter++;
	}
	
	public String getName() {
		return name;
	}

	public int getProtein() {
		return protein;
	}

	public int getCarbs() {
		return carbs;
	}

	public int getFat() {
		return fat;
	}

	public String toString() {
		String s = String.format("%s: p - %d%%, c - %d%%, %d%%", name, protein, carbs, fat);
		return s;
	}
	
	public int getNumberOfCreatedInstances() {
		return counter;
	}

	public static void main(String[] args) {
		
		FoodType a = new FoodType("banana", 4, 93, 3);
		System.out.println(a.toString());
		System.out.println(a.getNumberOfCreatedInstances());
	}

}
