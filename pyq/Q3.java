package pyq;
import java.util.Scanner;

public class Q3 {

    public static int findValue(String s) {
        int star = 0;
        int hash = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                star++;
            } else if (ch == '#') {
                hash++;
            }
        }

        return star - hash;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(findValue(s));

        sc.close();
    }
}