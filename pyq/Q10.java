package pyq;
import java.util.*;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        char[] b = new char[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = sc.next().charAt(0);

        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(a[i], b[i]);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(map.get(i) + " ");
        }

        sc.close();
    }
}