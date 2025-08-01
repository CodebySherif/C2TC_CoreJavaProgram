package day12.assessment;

public class BankSystemDemo {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 5000.0);

        try {
            account.deposit(2000);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        try {
            account.withdraw(8000);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }

        try {
            account.deposit(-100);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
