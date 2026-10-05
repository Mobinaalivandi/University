public class Sort {
    public static boolean sorted(int[] a, int i) {
        if (i == a.length - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return sorted(a , i + 1);
    }
}
