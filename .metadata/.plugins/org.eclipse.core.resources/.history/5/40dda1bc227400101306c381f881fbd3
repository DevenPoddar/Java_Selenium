package Day_3;
import java.util.Scanner;
public class My_Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Choose vehicle: 1. Car  2. Bike  3. Bulldozer");
        int choice = sc.nextInt();

        Ab_Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car1();
        } else if (choice == 2) {
            vehicle = new Bike();
        } else if (choice == 3) {
            vehicle = new Bulldozer();
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        vehicle.startEngine();
        sc.close();
	}

}
