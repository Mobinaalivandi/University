public class Sort {
    public static boolean sort(int[] a, int i) {
        if (i == a.length - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return sort(a , i + 1);
    }
}

