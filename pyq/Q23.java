

public class Q23 {
    public static void main(String[] args) {
        String s = "Amrit Rajput";
        String arr[]= s.split(" ");
        int maxLen = -1;
        String ans ="";
        for(int i  = 0;i<arr.length;i++){
            if(arr[i].length() > maxLen){
                maxLen = arr[i].length();
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
