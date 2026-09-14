import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int number = findNumber(n, p);
        System.out.println(number);
    }

    private static int findNumber(int n, int p) {
        if(n%p == 0) return n;
        int rem = n % p;
        for (int i = n+1; i < n + rem; i++) {
            if(i%p == 0) {
                return i;
                
            } 
        }
        return -1;
    }
}
