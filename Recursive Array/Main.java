import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sort v = new Sort();
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        boolean k =v.sorted(a , 0);
        System.out.println("The array is sorted in an ascending order : " + k);
    }
}
