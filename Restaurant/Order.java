public class Order {
    String food;
    int quantity;
    double price;
    public Order(String food , int quantity , double price) {
        this.food = food;
        this.quantity = quantity;
        this.price = price;
    }
    public void biggestquantity(Order[] foods) {
        Order maxx = foods[0];
        int max = foods[0].quantity;
        for ( int i = 0 ; i < foods.length ; ++i) {
            if ( max < foods[i].quantity ) {
                max = foods[i].quantity;
                maxx = foods[i];
            }
        }
        System.out.println("food with the biggest quantity : " + " " + maxx.food + " " + "=" + " " + max);
    }
    public void receipt (Order [] foods) {
        double total = 0;
        double multiply = 0;
        for ( int i = 0 ; i < foods.length ; ++i) {
            multiply = foods[i].quantity * foods[i].price;
            System.out.println("Foods name : " + " " + foods[i].food);
            System.out.println("Quantity of " + " " + foods[i].food + " : " + " " + foods[i].quantity);
            System.out.println("total cost of " + " " + foods[i].food + " : " + multiply );
            total = total + multiply;
        }
        System.out.println("Total cost : " + " " + total);
    }
}
