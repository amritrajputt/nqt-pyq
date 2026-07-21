package pyq;

public class Q7 {
    public static void main(String[] args) {
        int a[] = { 7, 0, 5, 1, 3 };
        int b[] = { 1, 2, 1, 3, 4 };
        int ans = getMaxGuest(a, b, 5);
        System.out.println(ans);
    }

    private static int getMaxGuest(int a[], int b[], int t) {
        int max = 0;
        int guest = 0;
        for (int i = 0; i < a.length; i++) {
            guest += a[i];
            guest -= b[i];
            max = Math.max(guest, max);
            if (i+1 == t) {
                return max;
            }
        }
        return -1;
    }
}
