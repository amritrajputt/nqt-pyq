//armstrong number

import java.util.Scanner;


public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] numbers = s.trim().split("\\s+");
        boolean found= false;
        for(String num:numbers){
            int n = Integer.parseInt(num);
            if(isArmStrong(n)){
                System.out.println(n);
                found=true;
            }
        }
        if(!found) System.out.println("No Armstrong number");
        sc.close();
    }
    private static boolean isArmStrong(int n){
        int temp = n;
        int sum =0;
        while(temp>0){
            int rem = temp%10;
            sum += rem*rem*rem;
            temp/=10;
        }
        return n==sum;
    }
}