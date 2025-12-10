public class Bank {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    public Bank(int accountNumber, double Balance, String accountHolderName ) {
        this.accountNumber = accountNumber;
        this.balance = Balance;
        this.accountHolderName = accountHolderName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void addMoney(double money) {
        balance += money;
    }
    public void subtractMoney(double money) {
        balance -= money;
    }

}
