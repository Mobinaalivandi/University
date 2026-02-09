import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while () {
            int n = input.nextInt();
            if (n < 0) {
                System.out.println("This amount is not acceptable , try again");
                continue;
            }
            Student[] list = new Student[n];
            for (int i = 0; i < list.length; i++) {
                double grades = input.nextDouble();
                if (grades < 0 || grades > 20) {
                    System.out.println("This grade is not acceptable , try again");
                    i--;
                    continue;
                }
                list[i] = new Student(grades);
            }

            while (true) {
                int choice = input.nextInt();
                if (choice > 5) {
                    System.out.println("Not acceptable . Enter another number");
                    continue;
                }
                System.out.println("Choose an option from the menu below");
                System.out.println("1.Calculate the avarge ");
                System.out.println("2.Find maximum and minimum score");
                System.out.println("3.Count passed and failed student");
                System.out.println("4.Show grades above average");
                System.out.println("5.Exit");

                if (choice == 1) {
                    list[0].average(list);
                } else if (choice == 2) {
                    list[0].maximin(list);
                } else if (choice == 3) {
                    list[0].passedfailed(list);
                } else if (choice == 4) {
                    list[0].aboveaverage(list);
                } else {
                    break;
                }
            }
        }
    }
}
