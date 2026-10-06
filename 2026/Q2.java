import java.util.*;

// You are given the Student ID and corresponding Score of N students.
// You are also given:
// - X → the score to check
// - K → the required frequency
// Count how many times score X appears.
// - If the frequency of X is greater than or equal to K, print the last Student ID having score X.
// - Otherwise, print -1.
// Input Format
// - First line: integer N
// - Next N lines: StudentID Score
// - Next line: integer X
// - Last line: integer K
// Example Input
// 5
// 112 13
// 114 15
// 117 15
// 118 13
// 119 20
// 15
// 2

// Output
// 117

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] ids = new String[N];
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            ids[i] = sc.next();
            scores[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;
        String lastId = "-1";
        for (int i = 0; i < N; i++) {
            if (scores[i] == X) {
                count++;
                lastId = ids[i];
            }
        }
        System.out.println(count >= K ? lastId : "-1");
        sc.close();
    }
}