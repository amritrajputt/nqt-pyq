
import java.util.Scanner;

// Given a string inputStr and an integer value, transform the string using the following rules:

// Letters (a–z, A–Z):
// Shift them forward in the alphabet by value positions.
// Wrap around after z or Z.
// Digits (0–9):
// Shift them forward by value.
// Wrap around after 9.
// Special characters:
// Replace @ with #.
// Replace any other special character with @.
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '@') {
                sb.append('#');
              } else if (c >= 'a' && c <= 'z') {
                int val = (c - 'a' + n) % 26;
                sb.append((char) ('a' + val));

            } else if (c >= 'A' && c <= 'Z') {
                int val = (c - 'A' + n) % 26;
                sb.append((char) ('A' + val));

            } else if (c >= '0' && c <= '9') {
                int val = (c - '0' + n) % 10;
                sb.append((char) ('0' + val));
            } else{
                sb.append('@');
            }
        }
        System.out.println(sb.toString());
    }
}
