package devices;

// This is the second way of doing this
public abstract class Device {
	int id;
	private DeviceType type;

	public Device(int id, DeviceType type){
		this.id = id;
		this.type = type;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
}
