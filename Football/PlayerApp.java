package App;
import Model.FootballPlayer;
import java.util.Scanner;
public class PlayerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        FootballPlayer[] list = new FootballPlayer[n];
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            String position = input.nextLine();
            int age = input.nextInt();
            int goals = input.nextInt();
            list[i] = new FootballPlayer(name, position, age, goals);
            input.nextLine();
        }

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i].getgoals();
        }
        System.out.println(sum);


        FootballPlayer s = list[0];
        int max = list[0].getgoals();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getgoals() > max) {
                max = list[i].getgoals();
                s = list[i];
            }
        }
        System.out.println(s.getname() + " " + s.getage() + " " + max);


        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].getgoals() < list[j].getgoals()) {
                    FootballPlayer temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getname() + " " + list[i].getposition() + " " + list[i].getage() + " " + list[i].getgoals());
        }
    }
}
