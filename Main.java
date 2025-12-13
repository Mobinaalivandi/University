import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        String[] s = new String[a];
        String[] l = new String[b];
        int[][] g = new int[a][b];
        multidimensional m = new multidimensional(s, l, g);
        for (int i = 0; i < a; ++i) {
            s[i] = input.nextLine();
        }
        m.sets(s);
        for (int i = 0; i < b; ++i) {
            l[i] = input.nextLine();
        }
        m.setl(l);
        for (int i = 0; i < a; ++i) {
            for (int j = 0; j < b; ++j) {
                g[i][j] = input.nextInt();
            }
        }
        m.setg(g);
        m.array(s, l, g);
        m.score(s, l, g);
        m.highest(s, l, g);
    }



    }
