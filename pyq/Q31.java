// You want to calculate the total shipping cost of a package based on its weight (in kg)
// and distance (in km). The cost calculation is:
//  Base cost: $5.00
//  Cost per kg: $2.00 per kg
//  Cost per 10 km: $0.50 per 10 km
// Calculate and print the total cost in dollars with 2 decimal places.
// Sample Input:
// 10 25
// Sample Output:
// $26.25

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int weight = sc.nextInt();
        int distance = sc.nextInt();
       

        double totalCost = calculateShippingCost(weight, distance);
        System.out.printf("$%.2f", totalCost);
        sc.close();
    }

    private static double calculateShippingCost(int weight, int distance) {
        double base = 5.00;
        double costPer10KM = 0.50;
        double costPerKG = 2.00;
        double weightCost = costPerKG * weight;
        double distanceCost = (distance / 10.0) * costPer10KM;
        return  base+distanceCost+weightCost;
    }
}
