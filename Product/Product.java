public class Product {
    private String name;
    private double price;
    public Product ( String name , double price) {
        this.name = name;
        this.price = price;
    }
    public String getname() { return name;
    }
    public double getprice() { return price;
    }
    public void printinfo(Product[]list) {
        for ( int i = 0 ; i < list.length ; ++ i) {
            System.out.println("Product " + " " + (i+1) + "'s name and price  : " + " " + list[i].getname() + " " + list[i].getprice()) ;
        }
    }
}


