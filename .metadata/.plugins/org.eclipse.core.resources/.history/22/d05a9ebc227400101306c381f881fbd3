package Day_3;

import java.util.Scanner;

public class My_Remote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Take remote: 1. Tv  2. Fan ");
        
        int taken = sc.nextInt();

        Ab_Remote remote;
        if (taken == 1) {
            remote = new Tv_Remote();
        } else if (taken == 2) {
            remote = new Tv_Remote();
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }
            remote.turnOn();
            remote.turnOff();
}
}