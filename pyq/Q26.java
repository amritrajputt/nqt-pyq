// A group of children stood in a line for a roll call. They were supposed to be numbered
// from 1 to N, but one of them forgot to bring their number tag. You are given the tags
// of the remaining N-1 children. Your task is to find the missing number so the teacher
// can correctly identify who’s missing.
// Sample Input
// Enter count N: 5
// Enter space-separated elements: 1 2 4 5
// Sample Output
// Missing number: 3
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = missingNumber(arr, n);
        System.out.println(ans);
        sc.close();
    }
    static int missingNumber(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }   
        }
        return n+1;
    }
}
