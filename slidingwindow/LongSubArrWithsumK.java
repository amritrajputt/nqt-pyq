package slidingwindow;

// ### Q15. Longest Subarray with Sum = K
// Find length of longest subarray with sum equal to K.  
// `Input: arr=[10,5,2,7,1,9], K=15` → `Output: 4`
public class LongSubArrWithsumK {
    public static int longestSum(int[] arr, int k) {

        // remember this will not work if array has negative elements because sliding
        // window not works on negative element
        int n = arr.length;
        int sum = 0, left = 0, maxLength = 0;
        for (int right = left; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                int len = right - left + 1;
                maxLength = Math.max(len, maxLength);
            }
        }
        return maxLength;
    }
}
