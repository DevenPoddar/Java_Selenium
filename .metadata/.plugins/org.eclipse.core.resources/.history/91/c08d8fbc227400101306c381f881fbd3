package Day_3;
import java.util.Scanner;
public class Car 
{

	private boolean engineStatus;
    private int speed;
    private double fuelLevel;
    
    public boolean isEngineOn() 
    {
        return engineStatus;
    }
    public void setEngineStatus(boolean status) 
    {
        this.engineStatus = status;
    }
    public int getSpeed() 
    {
        return speed;
    }
    public void setSpeed(int speed) 
    {
        if (engineStatus && speed >= 0) 
        {
            this.speed = speed;
        } else {
            System.out.println("Cannot set speed. please ON Engine and maintain speed is positive.");
        }
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("Invalid! fuel level is (0–100 only).");
        }
    }
    public void displayStatus() {
        System.out.println("\n Car Status:");
        System.out.println("Engine: " + (engineStatus ?   "ON" : "OFF"));
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Car c1 = new Car();

        System.out.print("Is engine ON? (true/false): ");
        boolean engine = sc.nextBoolean();
        c1.setEngineStatus(engine);

        System.out.print("Enter fuel level (0–100): ");
        double fuel = sc.nextDouble();
        c1.setFuelLevel(fuel);

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        c1.setSpeed(speed);

        c1.displayStatus();

	}

}
