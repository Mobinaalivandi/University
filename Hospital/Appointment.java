import java.util.Scanner;
public class Appointment {
    String patient;
    String doctor;
    String hour;
    public Appointment( String patient , String doctor , String hour) {
        this.patient = patient;
        this.doctor = doctor ;
        this.hour = hour;
    }
    public void printinfo(Appointment [] visits) {
        for (Appointment a : visits ) {
            System.out.println("Patients name : " + " " + a.patient );
            System.out.println("Doctors name : " + " " + a.doctor );
            System.out.println("Time of appointment : " + " " + a.hour);
        }
    }
    public void check(Appointment [] visits ) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for ( int i = 0 ; i < visits.length ; ++i) {
            if ( name.equals(visits[i].patient)) {
                System.out.println("Patients name : " + " " + visits[i].patient );
                System.out.println("Doctors name : " + " " + visits[i].doctor );
                System.out.println("Time of appointment : " + " " + visits[i].hour);
            }
        }
    }
}

