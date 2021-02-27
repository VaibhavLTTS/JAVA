import java.util.*;
public class Main {
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("1.Four Wheeler");
	System.out.println("2.Two Wheeler");
	System.out.println("Enter vehicle type");
	int n=sc.nextInt();
	System.out.println("Enter vehicle make");
    String make=sc.next();
    System.out.println("Enter vehicle number");
    int vehicleNumber=sc.nextInt();
    System.out.println("Enter Fuel type: \n1.petrol\n2.Diesel");
	String fuelType=sc.next();
	System.out.println("Enter fuel capacity");
	int fuelCapacity =sc.nextInt();
    System.out.println("Enter Engine cc");
	int cc =sc.nextInt();
	Vehicle v =new Vehicle(make,vehicleNumber,fuelType,fuelCapacity,cc);
	
	if(n==1)
	{
	    System.out.println("Audio system : ");
	    String audioSystem=sc.next();
	    System.out.println("Number od Doors : ");
	    int noOfDoors=sc.nextInt();
	    FourWheeler f=new FourWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc, audioSystem, noOfDoors);
	    f.setAudioSystem(audioSystem);
	    f.setNoOfDoors(noOfDoors);
	    v.displayBasicInfo();
	    f.displayDetailInfo();
	    
	   }
	
	else if(n==2)
	{
		  System.out.println("kick start Availabel:(yes/No) ");
		  boolean kickStartAvailable=sc.nextBoolean();
		  TwoWheeler t=new TwoWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc, kickStartAvailable);
		  t.setKickStartAvailable(kickStartAvailable);
		  v.displayBasicInfo();
		  t.displayDetailsInfo();
	}
	else
		
	
	
	
	sc.close();
}

}
