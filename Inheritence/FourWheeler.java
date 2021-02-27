
public class FourWheeler extends Vehicle {
private String audioSystem;
private int noOfDoors;

public FourWheeler(String make, int vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
		int noOfDoors) {
	super(make, vehicleNumber, fuelType, fuelCapacity, cc);
	this.audioSystem = audioSystem;
	this.noOfDoors = noOfDoors;
}
public String getAudioSystem() {
	return audioSystem;
}
public void setAudioSystem(String audioSystem) {
	this.audioSystem = audioSystem;
}
public int getNoOfDoors() {
	return noOfDoors;
}
public void setNoOfDoors(int noOfDoors) {
	this.noOfDoors = noOfDoors;
}
public void displayDetailInfo() {
 
	 System.out.println("-----Detail Information ------ ");
	 System.out.println("Audio System : "+audioSystem);
	 System.out.println("Number of Doors: " +noOfDoors);
	
}

}
