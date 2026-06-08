import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        while (true) {
            System.out.println(" Welcome ! Choose an option from the menu below : ");
            System.out.println("1. Add account");
            System.out.println("2. List all accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Show balance");
            System.out.println("6. Exit");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                int n = input.nextInt();
                input.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter the account number :");
                    String accountnumber = input.nextLine();
                    System.out.println("Enter the balance :");
                    double amount = input.nextDouble();
                    BankAccount c = new BankAccount(accountnumber, amount);
                    accounts.add(c);
                    System.out.println("Account number" + " " + (i + 1) + " " + "has been added successfully");
                    input.nextLine();
                }
            }
            if (choice == 2) {
                for (int i = 0; i < accounts.size(); i++) {
                    System.out.println("Account number" + " " + (i + 1) + " " + "'s account number" + " " + accounts.get(i).getaccountnumber());
                    System.out.println("Account number" + " " + (i + 1) + " " + "'s balance" + " " + accounts.get(i).getbalance());
                }
            }
            if (choice == 3) {
                System.out.println("Enter the index of the account you want to deposit to :");
                int choose = input.nextInt();
                System.out.println("Enter the amount you want to deposit to that account :");
                double amount = input.nextDouble();
                boolean find = false;
                for (int i = 0; i < accounts.size(); i++) {
                    if (choose == i) {
                        accounts.get(choose).deposit(amount);
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    System.out.println("No account with this index has been found");
                }
            }
            if (choice == 4) {
                System.out.println("Enter the index of the account you want to withdraw from :");
                int choose = input.nextInt();
                System.out.println("Enter the amount you want to withdraw from that account :");
                double amount = input.nextDouble();
                boolean find = false;
                for (int i = 0; i < accounts.size(); i++) {
                    if (choose == i) {
                        accounts.get(choose).withdraw(amount);
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    System.out.println("No account with this index has been found");
                }
            }
            if (choice == 5) {
                System.out.println("Enter the index of the account you're looking for :");
                int choose = input.nextInt();
                boolean find = false;
                for (int i = 0; i < accounts.size(); i++) {
                    if (choose == i) {
                        System.out.println("Account number : " + " " + accounts.get(i).getaccountnumber());
                        System.out.println("Account's balance : " + " " + accounts.get(i).getbalance());
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    System.out.println("No account with this index has been found");
                }
            }
            if (choice == 6) {
                System.out.println("You have chosen to exit . Goodbye !");
                break;
            }
        }
    }
}

