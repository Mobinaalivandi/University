public class BankAccount {
    private String accountnumber;
    private double balance;

    public BankAccount(String accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public String getaccountnumber() {
        return accountnumber;
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance =  balance + amount;
            System.out.println("New balance : " + " " + balance);
        } else {
            System.out.println("The amount you want to deposit is invalid");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("New balance : " + " " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("The amount you want to withdraw is invalid");
        }
    }
}