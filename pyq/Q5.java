package pyq;
import java.util.HashMap;
import java.util.Map;

public class Q5 {

    public static void main(String[] args) {

        char[] color = {'r', 'g', 'b', 'b', 'g', 'y', 'r', 'R'};

        printOddColor(color);
    }

    public static void printOddColor(char[] color) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : color) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : color) {
            if (map.get(ch) % 2 == 1) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("All are even");
    }
}