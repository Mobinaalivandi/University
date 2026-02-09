public class Student {
    private double grades;

    public Student(double grades) {
        this.grades = grades;
    }

    public double getgrades() {
        return grades;
    }

    public void average(Student[] list) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i].getgrades();
        }
        average = sum / list.length;
        System.out.println("The average of the grades are : " + " " + average);
    }

    public void maximin(Student[] list) {
        double max = list[0].getgrades();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getgrades() > max) {
                max = list[i].getgrades();
            }
        }
        System.out.println("The maximum grade is : " + " " + max);
        double min = list[0].getgrades();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getgrades() < min) {
                min = list[i].getgrades();
            }
        }
        System.out.println("The minimum grade is : " + " " + min);
    }

    public void passedfailed(Student[] list) {
        int passed = 0;
        int failed = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getgrades() < 10) {
                failed++;
            } else {
                passed++;
            }
        }
        System.out.println("Number of students that have passed : " + " " + passed);
        System.out.println("Number of students that have failed : " + " " + failed);
    }

    public void aboveaverage(Student[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getgrades() >= 15) {
                System.out.println("This grade is above average : " + " " + list[i].getgrades());
            }
        }
    }
}