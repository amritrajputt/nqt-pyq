package slidingwindow;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int low = 0, maxLen = Integer.MIN_VALUE;
        HashMap <Character,Integer> hm = new HashMap <>();
        for(int high = 0;high<s.length();high++){
            hm.put(s.charAt(high),hm.getOrDefault(s.charAt(high),0)+1);
            // k diya nhi hai to k nikl lenge kyunki variable size ka question hai
            int k = high-low+1;
            while(hm.size() < k){
                // 3 case hai : 1. k ke bararbar wala shi hai case 
                // 2.map size>k = kbhi nhi ho skta kyunki agar window me sb v unique hai to v atmax map ki size k ke barabr tk hi ja skti hai 
                // 3. map.size< k is case me hum low ko badha skte hai
                hm.put(s.charAt(low),hm.getOrDefault(s.charAt(low),0)-1);
                 if(hm.get(s.charAt(low)) ==0) hm.remove(s.charAt(low));
                 low++;
                 // low ko badhne se map ki size same v reh skti hai agar freq 1 se bdi ho to ya to ght v skti hai freq 1 k case me
                 // but window ki size hmesha km hogi kyunki window varibale size hai isiliye hm yha k ko update kr rhe hai 
                 k = high-low+1;
            }
            int len = high-low+1;
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
} 
