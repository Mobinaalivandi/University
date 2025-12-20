public class Student {
    private String name;
    private int grade;
    public Student ( String name , int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getname() { return name;
    }
    public int getgrade() { return grade;
    }
    public void printinfo(Student[]list) {
        for ( int i = 0 ; i < list.length ; ++ i) {
            System.out.println("Student " + " " + (i+1) + "'s name and grade  : " + " " + list[i].getname() + " " + list[i].getgrade()) ;
        }
    }
}
