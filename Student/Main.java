import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Calculate cal = new Calculate();
        Student[] list = new Student[n];
        for (int i = 0; i < n; ++i) {
            input.nextLine();
            String name = input.nextLine();
            int grade = input.nextInt();
            list[i] = new Student(name, grade);
        }
        list[0].printinfo(list);
        cal.check(list);
    }
}
