import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DollarPrice price = new DollarPrice();
        for (int i = 0; i < 30; ++i) {
            double d = input.nextDouble();
            price.add(d);
        }
        while (true) {
            System.out.println("Welcome ! choose an option from the menu below : ");
            System.out.println("1. Show all dollar prices ");
            System.out.println("2. Highest dollar price ");
            System.out.println("3. Lowest dollar price ");
            System.out.println("4. Average dollar price ");
            System.out.println("5. Exit");
            int choice = input.nextInt();
            if (choice == 1) {
                price.all();
            } else if (choice == 2) {
                price.highestp();
            } else if (choice == 3) {
                price.lowestp();
            } else if (choice == 4) {
                price.average();
            } else {
                System.out.println("You have chosen to exit . Goodbye ! ");
                break;
            }
        }
    }
}