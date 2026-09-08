// Time is an integral part of our life. So is horology, which is the discipline
// of studying time and clock making. A watchmaker is passionate about
// delivering the best watches with accurate time all over the world. Each watch
// he makes, he tests the time in it with a standard watch showing GMT of his
// place.

// The task here is to find if the new watch he made is working correctly and
// find the number of minutes (delay or early) such that:

// Compare the initial time (h, m) and the current time (h1, m1) in the new
// watch.

// The time after X hours in the new watch may be correct or incorrect. Display
// the number of minutes by which the new watch is lagging or early from the
// actual time. If the time is lagging, display a positive integer; if the time
// is early, display the negative integer.

// Given an initial time h:m, current time h1:m1, and x, display the delay in
// minutes from the initial time after x hours.
package pyq;

import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int x = sc.nextInt();
        int correctMin = (h + x) * 60 + m;
        int current = h1*60+m1;
        int diff =  correctMin-current;
        System.out.println(diff);
    }
}