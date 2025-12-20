import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculate cal = new Calculate();
        Product[] list = new Product[5];
        for (int i = 0; i < 5; ++i) {
            String name = input.nextLine();
            double price = input.nextDouble();
            input.nextLine();
            list[i] = new Product(name, price);
        }
        list[0].printinfo(list);
        cal.check(list);
    }
}

