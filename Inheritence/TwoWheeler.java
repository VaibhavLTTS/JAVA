
public class TwoWheeler extends Vehicle {
private boolean kickStartAvailable;


public TwoWheeler(String make, int vehicleNumber, String fuelType, int fuelCapacity, int cc,
		boolean kickStartAvailable) {
	super(make, vehicleNumber, fuelType, fuelCapacity, cc);
	this.kickStartAvailable = kickStartAvailable;
}

public boolean isKickStartAvailable() {
	return kickStartAvailable;
}

public void setKickStartAvailable(boolean kickStartAvailable) {
	this.kickStartAvailable = kickStartAvailable;
}

public void displayDetailsInfo() {
	System.out.println("-----Detail Information ------ ");
	System.out.println("Kick start Available : " +kickStartAvailable);
	
}

}