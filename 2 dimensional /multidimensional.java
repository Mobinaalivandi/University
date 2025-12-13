public class multidimensional {
    private String[] s;
    private String[] l;
    private int[][]g;
    multidimensional ( String[] s , String[] l , int[][] g) {
        this.s = s;
        this.l = l;
        this.g = g ;
    }
    public String[] gets() { return s;
    }
    public String[] getl() { return l ;
    }
    public int[][] getg() { return g ;
    }
    public void sets(String[] s) { this.s = s;
    }
    public void setl(String[] l ) { this.l = l;
    }
    public void setg(int[][] g) { this.g = g;
    }
    public multidimensional() {
    }
    public void array (String[] s , String[] l , int[][] g) {
        double average = 0 ;
        for (int i = 0; i < gets().length; ++i) {
            double sum = 0;
            for (int j = 0; j < getl().length; ++j) {
                sum = getg()[i][j] + sum;
            }
            average = sum / getl().length;
            System.out.println(gets()[i] + " " + "'s average score is : " + " " + average );
        }
    }
    public void score(String[] s, String[] l, int[][] g) {
        double max = 15.00;
        double average = 0;
        for (int i = 0; i < gets().length; ++i) {
            double sum = 0;
            for (int j = 0; j < getl().length; ++j) {
                sum = getg()[i][j] + sum;
            }
            average = sum / getl().length;
            if (average > max) {
                System.out.println(gets()[i] + " " + "'s average score is higher than 15");
            }
        }
    }
    public void highest(String[] s, String[] l, int[][] g) {
        double average = 0;
        double max = 0;
        String maxx = "";
        for (int i = 0; i < gets().length; ++i) {
            double sum = 0;
            for (int j = 0; j < getl().length; ++j) {
                sum = getg()[i][j] + sum;
            }
            average = sum / getl().length;
            if (average > max) {
                max = average;
                maxx = gets()[i];
            }
        }
        System.out.println( maxx + " " + "has the highest average score with : " + " " + max);
    }
}




