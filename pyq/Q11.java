package pyq;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
         
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count0 =0,count1=0,count2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) count0++;
            else if(arr[i] == 1) count1++;
            else count2++;
        }
        int ind = 0;
        for(int i = 0;i<count0;i++){
            arr[ind++]= 0;
        
        }
        for(int i = 0;i<count1;i++){
            arr[ind++]= 1;
        }
        for(int i = 0;i<count2;i++){
            arr[ind++]= 2;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
