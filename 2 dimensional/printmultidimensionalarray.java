import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] g = new int[a][b];
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                g[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                System.out.print(g[i][j] + " ");
            }
        }
    }
}
