package pyq;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        String day = sc.next();
        int ans = countSunday(days, day.toLowerCase());
        System.out.print(ans);
    }

    private static int countSunday(int days, String day) {

        String[] week = {
                "monday", "tuesday", "wednesday",
                "thursday", "friday", "saturday", "sunday"
        };

        int start = 0;
        for (int i = 0; i < 7; i++) {
            if (week[i].equals(day)) {
                start = i;
                break;
            }
        }

      
    int sundayCount = days / 7;

    int rem = days % 7;
    for (int i = 0; i < rem; i++) {
        if ((start + i) % 7 == 6) {
            sundayCount++;
        }
    }

    return sundayCount;
}
}