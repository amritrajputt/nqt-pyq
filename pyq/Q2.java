package pyq;

/*you have to calculate gym cost membership
duration 3-5000,6-7000,9-12000,12-15000
given an input return the total cost
*/
public class Q2 {
    public static void main(String[] args) {
        int ans = getCost(8);
        if(ans == 0)
            System.out.print("Error");
        else
            System.out.println(ans);
    }

    public static int getCost(int month){
        if(month%12==0){
            int temp = month/12;
            return temp*15000;
        }else if(month%9==0){
             int temp = month/9;
            return temp*12000;
        }
        else if(month <=6) {
             int temp = month/6;
            return temp*7000;
        }
        else if (month <= 3){
            int temp = month/3;
            return temp*5000;
        }else{
            return 0;
        }
}
}