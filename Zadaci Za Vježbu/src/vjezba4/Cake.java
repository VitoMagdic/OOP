package vjezba4;

public class Cake extends Dessert {

	public Cake(String n, double w, int c, boolean b, String string) {
		super(n, w, c);
		// TODO Auto-generated constructor stub
	}

	private boolean containsGluten;
	private String cakeType;
	
	public boolean isContainsGluten() {
		return containsGluten;
	}

	public void setContainsGluten(boolean containsGluten) {
		this.containsGluten = containsGluten;
	}

	public String getCakeType() {
		return cakeType;
	}

	public void setCakeType(String cakeType) {
		this.cakeType = cakeType;
	}

	@Override
	public String toString() {
		return String.format("Name : %s \nWeight : %f \nCalories : %d \n Gluten : %b \n Type : %s", name, weight, calories, containsGluten, cakeType);
	}
	
	public String getDessertType() {
		return getCakeType().concat("cake");
	}
	

	public static void main(String[] args) {
		

	}

}
