
public class Vehicle {
	private String make;
	private int vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	
	public Vehicle(String make, int vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void displayBasicInfo() 
	{
		 System.out.println("-----Basic Information ------ ");
		 System.out.println("*****" +make +"*******");
		 System.out.println(" Vehicle Number:"+vehicleNumber);
		 System.out.println(" Fuel Type:"+fuelType);
		 System.out.println(" Fuel capacity:"+fuelCapacity);
		 System.out.println(" cc:"+cc);
		 
	}
	
	
}	