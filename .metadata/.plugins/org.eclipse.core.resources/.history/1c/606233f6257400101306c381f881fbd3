package com.Day6;
import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class DepositeBalanceException extends Exception {
	public DepositeBalanceException(String message) {
		super(message);
	}
}

public class ATM {
		
		private static final int CORRECT_PIN = 2323;
	    private static double balance = 10000.00;

	    public static void verifyPin(int pin) throws InvalidPinException {
	        if (pin != CORRECT_PIN) {
	            throw new InvalidPinException("Invalid PIN entered.");
	        }
	    }
	    
	    public static void withdraw(double amount) throws InsufficientBalanceException {
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance.");
	        } 
	        else {
	            balance = balance - amount;
	            System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
	        }
	    }
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
	  
		Scanner sc = new Scanner(System.in);
		boolean transactionSuccess = false;
		
		System.out.println("Welcome to ATM");
		System.out.println("Inert Your Card");
		
		try {
			
			int attempts = 3;
            boolean pinVerified = false;
            
            while (attempts > 0 && !pinVerified) {
                System.out.print("Enter your 4-digit PIN: ");
                int enteredPin = sc.nextInt();
                
                try {
                    verifyPin(enteredPin);  // throw InvalidPinException
                    pinVerified = true;
                } catch (InvalidPinException e) {
                    attempts--;
                    System.out.println(e.getMessage());
                    if (attempts > 0) {
                        System.out.println("Attempts left: " + attempts);
                    } else {
                        System.out.println("Card blocked due to multiple wrong attempts.");
                        return;
                    }
		
               }
            }
            
            System.out.print("Enter amount to withdraw: ₹");
            double amount = sc.nextDouble();

            withdraw(amount);  // throw InsufficientBalanceException
            transactionSuccess = true;
            
            System.out.print("Enter amount to withdraw: ₹");
            double amount1 = sc.nextDouble();
		
		}catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
        	System.out.println("Transaction logged. Status: " + (transactionSuccess ? "Success" : "Failed"));
            sc.close();
        }

	}

}
