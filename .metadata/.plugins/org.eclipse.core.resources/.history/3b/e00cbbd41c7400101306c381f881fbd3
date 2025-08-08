package com.banking;

public class Account_Service_Imp implements Account_Service {

	private Account[] accounts = new Account[10];
    private int count = 0;
	@Override
	public void registerAccount(Account account) {
		// TODO Auto-generated method stub
		if (count < accounts.length) {
            accounts[count++] = account;
            System.out.println("Account registered for: " + account.getName());
        } else {
            System.out.println("Account limit reached.");
        }
	}

	@Override
	public void showAllAccounts(Account account) {
		// TODO Auto-generated method stub
		
		System.out.println("\nRegistered Accounts:");
        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            System.out.println("Account No: " + acc.getAcc_no() +
                               ", Name: " + acc.getName() +
                               ", Balance: ₹" + acc.getBalance());

	}

}
}
