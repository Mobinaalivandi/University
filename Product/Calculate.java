public class Calculate {
    public void check(Product[]list) {
        for ( int i = 0 ; i < list.length ; ++i) {
            if (list[i].getprice() <= 50) {
                System.out.println(list[i].getname() + " " + "with the price " + " " + list[i].getprice() + " " + "is cheap");
            } else if (50 < list[i].getprice() && 200 >= list[i].getprice()) {
                System.out.println(list[i].getname() + " " + "with the price " + " " + list[i].getprice() + " " + "is normal");
            } else {
                System.out.println(list[i].getname() + " " +"with the price " + " " + list[i].getprice() + " " + "is expensive");
            }
        }
    }
}
