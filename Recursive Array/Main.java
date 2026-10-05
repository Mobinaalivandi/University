import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        boolean k =Sort.sorted(a , 0);
        System.out.println("The array is sorted in an ascending order : " + k);
    }
}
