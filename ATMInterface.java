public class ATMInterface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(500.00); // Initial balance is $500
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
