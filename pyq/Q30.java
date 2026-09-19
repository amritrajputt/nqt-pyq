//armstrong number

import java.util.Scanner;


public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int rem = n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if (sum==temp) System.out.print("true");
        else System.out.println("false");
        sc.close();
    }
}