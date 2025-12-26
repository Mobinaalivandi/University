import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Number of Orders : " + " " + n);
        Order[] foods = new Order[n];
        for (int i = 0; i < n; ++i) {
            String food = input.nextLine();
            int quantity = input.nextInt();
            double price = input.nextDouble();
            input.nextLine();
            foods[i] = new Order(food, quantity, price);
        }
        foods[0].biggestquantity(foods);
        foods[0].receipt(foods);
    }
}

