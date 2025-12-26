import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        System.out.println("The number of appointments for today : " + " " + n);
        Appointment[] visits = new Appointment[n];
        for (int i = 0; i < n; ++i) {
            String patient = input.nextLine();
            String doctor = input.nextLine();
            String hour = input.nextLine();
            visits[i] = new Appointment(patient, doctor, hour);
        }
        visits[0].printinfo(visits);
        visits[0].check(visits);
    }
}

