public class Calculate {
    public void maximum(list3[] lists) {
        String max = "";
        double maxx = 0;
        for (int i = 0; i < lists.length; ++i) {
            if (maxx < lists[i].getprice()) {
                maxx = lists[i].getprice();
                max = lists[i].name;
            }
        }
        System.out.println(maxx + " " + max);
    }

    public void summ(list3[] lists) {
        double sum = 0;
        double worth = 0;
        for (int i = 0; i < lists.length; ++i) {
            sum = lists[i].getprice() * lists[i].getquantity();
            worth = worth + sum;
        }
        System.out.println(worth);
    }

    public void minn(list3[] lists) {
        list3 s1 = lists[0];
        int min = lists[0].getquantity();
        for (int i = 0; i < lists.length; ++i) {
            if (min > lists[i].getquantity()) {
                min = lists[i].getquantity();
                s1 = lists[i];
            }
        }
        System.out.println(s1.getquantity());
        System.out.println(s1.getprice());
        System.out.println(s1.name);
            }
        }

