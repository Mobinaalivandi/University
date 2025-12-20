public class Calculate {
    public void check (Student[] list) {
        for ( int i = 0 ; i < list.length ; ++i) {
            if (list[i].getgrade() > 60 ) {
                System.out.println(list[i].getname() + " " + "has passed" + " " + "with the grade : " + " " + list[i].getgrade());
            } else {
                System.out.println(list[i].getname() + " " + "has failed" +  " " + "with the grade : " + " " + list[i].getgrade());
            }
        }
    }
}
