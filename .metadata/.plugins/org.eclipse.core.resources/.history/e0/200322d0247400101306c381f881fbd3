package ex;
import java.util.Scanner;

public class Atm_pin_tracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Correct Pin: " );
        int correct_pin = sc.nextInt();
    
        int max_attempts = 3;
        boolean access = false;

        for (int attempt = 1; attempt <= max_attempts; attempt++) {
            System.out.print("Enter your 4-digit ATM PIN: ");
            int entered_pin = sc.nextInt();

            if (entered_pin == correct_pin) {
                System.out.println(" Access Granted Welcome!");
                access = true;
                break;
            } else {
                int remaining = max_attempts - attempt;
                if (remaining > 0) {
                    System.out.println(" Incorrect PIN You have " + remaining + " attempt(s) left.");
                } else {
                    System.out.println(" Card Blocked Too many incorrect attempts.");
                }
            }
        }
                

		
	}

}
	
