
// Question 3 — First & Last Occurrence
// You are given a sorted array of integers of size N and a target value X.
// Your task is to:
// 1. Find the first occurrence of X.
// 2. Find the last occurrence of X.
// 3. Find the difference between the last and first occurrence.
// The solution must use Binary Search.
// If X is not present in the array, print -1.
// Input Format
// - First line contains integer N.
// - Second line contains N space-separated sorted integers.
// - Third line contains the target integer X.
// Output Format
// If X exists, print:
// FirstOccurrence LastOccurrence Difference

// If X does not exist, print:
// -1

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        int low = binarySearchLeft(0, arr.length - 1, X, arr);
        int high = binarySearchRight(0, arr.length - 1, X, arr);

        if (low == -1) {
            System.out.println(-1);
        } else {
            System.out.println(low + " " + high + " " + (high - low));
        }
    }

    private static int binarySearchLeft(int low, int high, int X, int[] arr) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == X) {
                ans = mid;
                high = mid - 1;
            } 
            else if (arr[mid] > X) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static int binarySearchRight(int low, int high, int X, int[] arr) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == X) {
                ans = mid;
                low = mid + 1;
            } 
            else if (arr[mid] > X) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}