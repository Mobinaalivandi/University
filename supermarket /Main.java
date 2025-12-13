import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculate l = new Calculate();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        list3[] lists = new list3[n];
        for (int i = 0; i < n; ++i) {
            double price = input.nextDouble();
            int quantity = input.nextInt();
            list3 list = new list3(price, quantity);
            String name = input.next();
            list.name = name;
            lists[i] = list;
        }
        l.maximum(lists);
        l.summ(lists);
        l.minn(lists);
    }
}













