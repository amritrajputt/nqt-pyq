// Given an array of integers and a target sum, find and print all continuous subarrays
// whose elements sum up exactly to the target value.
// Sample Input:
// arr = [3, 4, -7, 1, 3, 3, 1, -4]
// target = 7
// Sample Output:
// 3 4
// 1 3 3
// 3 3 1
// Explanation:
//  Subarrays [3, 4], [1, 3, 3], and [3, 3, 1] all sum to 7.
//  The program finds and prints all such subarrays.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q32 {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        subArrays(arr, target, ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        sc.close();
    }

    private static void subArrays(int arr[], int target, ArrayList<ArrayList<Integer>> ans) {
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int required = prefixSum - target;

            if (map.containsKey(required)) {
                int startIndex = map.get(required) + 1;
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = startIndex; j <= i; j++) {
                    temp.add(arr[j]);
                }
                ans.add(temp);
            }
            map.put(prefixSum, i);
        }
    }
}
