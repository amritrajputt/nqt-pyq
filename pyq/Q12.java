package pyq;

public class Q12 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int currMin = arr[0];
        int profit = 0;
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currMin) {
                profit = arr[i] - currMin;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                currMin = arr[i];
            }
        }
        System.out.println(maxProfit);
    }
}
