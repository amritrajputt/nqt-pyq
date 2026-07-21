package pyq;

public class Q4 {
    
    public static void main(String[] args) {
        int ans[]= {7,4,8,2,9};
        System.out.println(countElement(ans));
    }
    private static int countElement(int arr[]){
        int count = 1;
        int max=arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }else{
                continue;
            }
        }
        return count;
    }
}
