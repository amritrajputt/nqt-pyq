import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        String parts[] = input.split(",");
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (String s : parts) {
            int val = Integer.parseInt(s.trim());
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> temp = new ArrayList<>(freq.entrySet());
        temp.sort((a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < k && i < temp.size(); i++) {
            System.out.println(temp.get(i).getKey() + " ");
        }
        sc.close();
    }
}
