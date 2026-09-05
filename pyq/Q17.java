

import java.util.*;
//  A store tracks the sales of items. For each sale, the item name, quantity, and price per unit are recorded.

// Your task is to:

// Find the most sold item (in terms of total revenue).
// Calculate total sales revenue.
// Calculate average revenue per entry.
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Double> sales = new HashMap<>();
        double totalRevenue = 0.00;
        for (int i = 1; i <= n; i++) {
            String item = sc.next();
            int quantity = sc.nextInt();
            int price = sc.nextInt();
            double revenue = quantity * price;
            sales.put(item, sales.getOrDefault(item, 0.00) + revenue);
            totalRevenue += revenue;
        }
        String mostSoldItem = "";
        double maxSales = 0;
        for (Map.Entry<String, Double> entry : sales.entrySet()) {
            String i = entry.getKey();
            double val = entry.getValue();
            if(val>maxSales){
                mostSoldItem = i;
                maxSales = val;
            } 
        }
        double avg = totalRevenue / n;

        System.out.println("Most Sold Item: " + mostSoldItem);
        System.out.printf("Total Revenue: %.2f%n", totalRevenue);
        System.out.printf("Average Revenue: %.2f%n", avg);

        sc.close();
    }
    
}
