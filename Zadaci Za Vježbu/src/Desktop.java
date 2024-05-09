package vjezba5;

public class Desktop extends Computer{

	private double caseHeight;
	
	
	
	public Desktop(String mod, String man, String os, double ch) {
		super(mod, man, os);
		this.caseHeight = ch;
	}

	public double getCaseHeight() {
		return caseHeight;
	}

	public void setCaseHeight(double caseHeight) {
		this.caseHeight = caseHeight;
	}

	public String getComputerType() {
		return "desktop computer";
	}
	
	public int calculatePortabilityScore() {
		return 5 + (int) (caseHeight / 30);
	}
	
	@Override
	public String toString() {
		return "Desktop [model=" + model + ", manufacturer=" + manufacturer + ", operatingSystem=" + operatingSystem + ", caseHeight=" + caseHeight + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
