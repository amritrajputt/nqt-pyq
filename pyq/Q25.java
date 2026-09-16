// A mysterious machine processes only three numbers: 3, 6, and 7. These numbers
// are placed on a conveyor belt in a random order. The machine’s job is to sort them
// using only swaps such that all 3s come first, followed by 6s, and then all 7s at the
// end — similar to separating colored balls. Your job is to simulate the machine's
// sorting process.
// Sample Input
// 3 7 6 7 3 6 3
// Sample Output
// 3 3 3 6 6 7 7

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort012(arr);
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
        }
        sc.close();
    }

    private static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if(arr[mid] == 3){
                swap(arr, low++, mid++);
            }else if(arr[mid] == 6){
                mid++;
            }else{
                swap(arr, mid, high--);
            }
        }
    }
    private  static void  swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
}
