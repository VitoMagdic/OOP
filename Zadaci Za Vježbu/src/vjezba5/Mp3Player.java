package vjezba5;

public class Mp3Player extends Device{

	protected int batteryCapacity, memorySize;
	
	public Mp3Player(int batteryCapacity, int memorySize) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.memorySize = memorySize;
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
