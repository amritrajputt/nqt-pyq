package slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// ### Q14. First Negative Number in Every Window of Size K
// Print first negative number in each window. If none, print 0.  
// `Input: arr=[12,-1,-7,8,-15,30,16,28], K=3` → `Output: [-1,-1,-7,-15,-15,0]`
 class FirstNeginEveryWindowSizeK {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList <Integer> result = new ArrayList<>();
        int n = arr.length;
        Queue <Integer> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            if(arr[i]<0)
                q.add(i);
        }
        for(int i = 0;i<n-k+1;i++){
           while(q.size()>0 && q.peek() < i) q.remove();
           if(q.size()>0 &&q.peek() <= i+k-1){
               result.add(arr[q.peek()]);
           }else result.add(0);
        }
        return result;
    }
}