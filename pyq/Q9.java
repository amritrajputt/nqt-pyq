package pyq;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int key = sc.nextInt();

        if (key < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + key) % 26);
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + key) % 26);
            } else if (ch >= '0' && ch <= '9') {
                ch = (char) ('0' + (ch - '0' + key) % 10);
            }

            ans.append(ch);
        }

        System.out.println(ans);
        sc.close();
    }
}