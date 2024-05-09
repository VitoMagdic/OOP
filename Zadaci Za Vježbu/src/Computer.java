package vjezba5;

public abstract class Computer extends Device{

	protected String model, manufacturer, operatingSystem;
	
	public Computer(String mod, String man, String os){
		this.model = mod;
		this.manufacturer = man;
		this.operatingSystem = os;
	}
		
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	@Override
	public String toString() {
		return "Computer [model=" + model + ", manufacturer=" + manufacturer + ", operatingSystem=" + operatingSystem
				+ "]";
	}

	public abstract String getComputerType();
	
	public abstract int calculatePortabilityScore();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
