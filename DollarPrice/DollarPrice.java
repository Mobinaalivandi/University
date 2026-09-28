public class DollarPrice {
   public Node head;
   public Node tail;
   public int count ;

   public void add(double price) {
       Node n = new Node(price);
       if (head == null) {
           head = n;
           tail = n;
       } else {
           tail.next = n;
           tail = n;
       }
       ++count;
   }
   public void highestp() {
       Node c = head;
       double max = head.price;
       while(c != null) {
           if (c.price > max) {
               max = c.price;
           }
           c = c.next;
       }
       System.out.println("The highest dollar price in the past month was:" + max);
       }
       public void lowestp() {
           Node m = head;
           double min = head.price;
           while(m != null) {
               if (m.price < min) {
                   min = m.price;
               }
               m = m.next;
           }
           System.out.println("The lowest dollar price in the past month was:" + min);
       }

       public void average () {
           Node c = head;
           double sum = 0;
           double a = 0;
           while (c != null) {
               sum = sum + c.price;
               c = c.next;
           }
           a = sum / count;

           System.out.println("The average dollar price in the past month was:" + a);
       }
       public void all () {
       Node c = head;
       while(c!=null) {
           System.out.println(c.price);
           c = c.next;
       }
       }
       }