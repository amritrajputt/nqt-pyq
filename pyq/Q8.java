package pyq;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Total monkeys
        int m = scanner.nextInt(); // Total bananas
        int p = scanner.nextInt(); // Total peanuts
        int k = scanner.nextInt(); // Bananas eaten by one monkey
        int j = scanner.nextInt(); // Peanuts eaten by one monkey

        int bananaMonkeys = (m + k - 1) / k;
        int peanutMonkeys = (p + j - 1) / j;

        int remainingMonkeys = n - (bananaMonkeys + peanutMonkeys);

        if (remainingMonkeys < 0) {
            remainingMonkeys = 0;
        }

        System.out.println(remainingMonkeys);

        scanner.close();
    }
}
