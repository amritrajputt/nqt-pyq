package pyq;

import java.util.*;

/*Given an integer array A of size N, find the length of the longest sequence of consecutive integers
 that can be formed from the array elements. The elements do not need to be adjacent in the array.*/
public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int ans = count(arr);
        System.out.println(ans);
    }

    private static int count(int[] arr) {
        int max = 1;
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }
}
