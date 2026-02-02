import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        Students list[] = new Students[n];
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            int grade = input.nextInt();
            if ( grade < 0 || grade > 20) {
                System.out.println("This grade is not acceptable");
                i--;
                continue;
            }
            input.nextLine();
            list[i] = new Students(name, grade);
        }
        list[0].average(list);
        list[0].highestgrade(list);
        list[0].passed(list);
    }
}

