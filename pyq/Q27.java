
//You are tasked with finding all numbers in a given range [n, m] that are prime and
// have a special property: the sum of their digits is also a prime number. For example,
// the number 23 is prime, and its digits sum to 5 (2+3), which is also prime. Your job is
// to print all such numbers between the given input range.
// Sample Input:
// 10 30
// Sample Output:
// 11
// 23
// 29
import java.util.ArrayList;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (isPrime(i) && isPrime(sumOfDigits(i))) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
