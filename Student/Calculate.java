public class Calculate {
    public void check (Student[] list) {
        int pass = 60;
        for ( int i = 0 ; i < list.length ; ++i) {
            if (list[i].getgrade() > 60 ) {
                System.out.println(list[i].getname() + " " + "has passed");
            } else {
                System.out.println(list[i].getname() + " " + "has failed");
            }
        }
    }
}
