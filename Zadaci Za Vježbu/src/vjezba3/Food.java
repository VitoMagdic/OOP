package vjezba3;

public class Food {

	private FoodType type;
	private int weight;
	
	public Food(FoodType t, int w) {
		type = t;
		weight = w;
	}
	
	public FoodType getType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
	}

	public String toString() {
		String s = String.format("%s, w - %dg", type.toString(), weight );
		return s;
	}
	
	public double getProtein() {
		return ((double) type.getProtein()) / 100 * weight;
	}
	
	public double getCarbs() {
		return ((double) type.getCarbs()) / 100 * weight;
	}
	
	public double getFat() {
		return ((double) type.getFat()) / 100 * weight;
	}
	
	public String toStringInGrams() {
		return String.format("%s: p - %.1fg, c - %.1fg, f - %.1fg, w - %dg", type.getName(), getProtein(), getCarbs(), getFat(), getWeight());
	}
	
	public static void main(String[] args) {

		FoodType foodType = new FoodType("banana", 4, 93, 3);
		Food food = new Food(foodType, 110);
		System.out.println(food.toStringInGrams());
		
	}

}
