package Day_3;

public class Bank_account {
	
	private int Bank_Balance;
	
	public Bank_account(int initial_balance) {
		if(initial_balance >= 0) {
			Bank_Balance = initial_balance;
			
		}
		else {
			Bank_Balance = 0;
			System.out.println("Balance is 0");
		}
	}
	public int getBalance() {
        return Bank_Balance;
    }
	public void deposite(int amount) {
		if(amount >0 ) {
			Bank_Balance += amount; 
			System.out.println(amount+" rupees Credited to your acount.");
		}
		 else {
	            System.out.println("Invalid deposit amount.");
	        }
	}
	public void withdraw(int amount) {
		if(amount > 0 && amount <= Bank_Balance) {
			Bank_Balance -= amount;
			System.out.println(amount+" rupess Withdraw from your account.");
		}
		else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
			
	}
	
}
