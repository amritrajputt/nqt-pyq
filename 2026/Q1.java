import java.util.*;
// Given an array of match scores and an integer K, find the scores with the highest frequencies.
// Print the scores arranged in decreasing order of frequency and return only the first K scores.
// If two scores have the same frequency, the score that appears first in the original array should come first.
// Input Format
// - First line contains the array elements separated by commas.
// - Second line contains an integer K.
// Output Format
// Print the top K most frequent scores.

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
