
// In a kingdom's council, each noble gives their opinion by submitting a token with their
// vote. After all votes are collected, the king wants to know if there's any opinion
// (element) that was supported by more than N/3 nobles. Help the king identify such
// majority elements.
// Sample Input
// Enter space-separated elements: 1 2 3 2 2 4 2
// Sample Output
// 2
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = majority(arr, n);
        System.out.println(ans);
        sc.close();
    }

    static int majority(int[] arr, int n) {
        int ele = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != ele) {
                count--;
                if (count == 0) {
                    ele = arr[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }
        count = 0;
        for (int x : arr) {
            if (x == ele) {
                count++;
            }
        }

        return count > n / 3 ? ele : -1;
    }
}