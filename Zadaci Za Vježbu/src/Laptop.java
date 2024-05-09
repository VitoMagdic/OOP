package vjezba5;

public class Laptop extends Computer{

	private int batteryCapacity;
	private double weight;
	
	public Laptop(String mod, String man, String os, int bc, double w) {
		super(mod, man, os);
		this.batteryCapacity = bc;
		this.weight = w;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getComputerType() {
		return "laptop computer";
	}
	
	public int calculatePortabilityScore() {
		return (int) this.weight;
	}
	
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", manufacturer=" + manufacturer + ", operatingSystem=" + operatingSystem + ", batteryCapacity=" + batteryCapacity + ", weight=" + weight + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
