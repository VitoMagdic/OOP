package vjezba3;

public class Meal {

	private Food[] ingredients;
	
	public Meal(Food...ingr) {
		this.ingredients = new Food[ingr.length];
		for(int i = 0; i < ingr.length; i++) { 
			ingredients[i] = ingr[i];
		}
	}
	
	public void printIngredients() {
		for(int i = 0; i < ingredients.length; i++) {
			System.out.println(String.format("Ingredient[%d] = %s", i, ingredients[i].toStringInGrams()));
		}
	}
	
	public int getNumberOfIngredients() {
		return ingredients.length;
	}
	
	public Food getIngredient(int i) {
			
		if(i < 0 || i >= ingredients.length) return null;
		
		return ingredients[i];
	}
	
	public int getWeight() {
		int w = 0;
		for(int i = 0; i < ingredients.length; i++) {
			w += ingredients[i].getWeight();
		}
		return w;
	}
	
	public Meal(Meal m, int w) {
		this.ingredients = new Food[m.getNumberOfIngredients()];
		
		for(int i = 0; i < ingredients.length; i++) {
			this.ingredients[i] = new Food(m.getIngredient(i).getType(), m.getIngredient(i).getWeight() * w / m.getWeight()); 
		}
	}
	
	public double compare(Meal one, Meal two) {
		int ind = 0;
		
		for(int i = 0; i < one.getNumberOfIngredients(); i++) {
			for(int j = 0; j < two.getNumberOfIngredients(); j++) {
				if(one.getIngredient(i).getType().equals(two.getIngredient(i).getType())) {
					ind = i;
				}
			}
		}
		
		double p1 = one.getIngredient(ind).getWeight() / one.getWeight() * 100;
		double p2 = two.getIngredient(ind).getWeight() / two.getWeight() * 100;
		
		if(p1 < p2) return p1;
		else return p2;
		
	}
	
	
	public static void main(String[] args) {
		
		FoodType banana = new FoodType("banana", 4, 93, 3);
		Food oneBanana = new Food(banana, 110);
		FoodType grapes = new FoodType("grapes", 4, 94, 2);
		Food grapeCluster = new Food(grapes, 151);
		Meal fruitSalad = new Meal(oneBanana, grapeCluster);
		System.out.println("* original meal:");
		fruitSalad.printIngredients();
		System.out.println("* new meal:");
		Meal doubleFruitSalad = new Meal(fruitSalad, 522);
		doubleFruitSalad.printIngredients();

	}

}
