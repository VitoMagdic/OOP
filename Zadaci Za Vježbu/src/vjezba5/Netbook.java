package vjezba5;

public final class Netbook extends Laptop{

	public Netbook(String mod, String man, String os, int bc, double w) {
		super(mod, man, os, bc, w);
		// TODO Auto-generated constructor stub
	}
	
	public int calculatePortabilityScore() {
		return 1;
	}
	
	public String getComputerType() {
		return "netbook laptop computer";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
