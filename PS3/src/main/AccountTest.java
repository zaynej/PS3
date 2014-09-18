package main;

public class AccountTest {
	public static void main(String[] args) throws InsufficientFundsException {

		Account accountTest = new Account(1122, 22000);
		accountTest.setInterest(.045);
		accountTest.withdraw(2500);
		accountTest.deposit(3000);
		try {
			accountTest.withdraw(2500);
			System.out.println("Current balance: $" + accountTest.getBalance());
		} catch (InsufficientFundsException e) {
			System.out.println("Your account is short by: $" + e.getAmount());
			e.printStackTrace();
		}
		System.out.println("Current balance: $" + accountTest.getBalance());
		System.out.println("Interest: " + accountTest.getMonthlyInterestRate());
		System.out.println("Date created: " + accountTest.getDate());

	}
}
