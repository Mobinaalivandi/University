public class Students {
    private String name;
    private int grade;

    public Students(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getname() {
        return name;
    }

    public int getgrade() {
        return grade;
    }

    public void average(Students list[]) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i].getgrade();
        }
        avg = sum / list.length;
        System.out.println("the average of the grades is : " + " " + avg);
    }

    public void highestgrade(Students list[]) {
        int max = list[0].getgrade();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getgrade() > max) {
                max = list[i].getgrade();
            }
        }
        System.out.println("The highest grade is  : " + " " + max);
    }

    public void passed(Students list[]) {
        int pass = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getgrade() >= 10) {
                pass++;
            }
        }
        System.out.println("the number of students that have passed : " + " " + pass);
    }
}
