package pyq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*you are given n bank transactions. Each transaction has a sender,receiver,amount,timestamp. 
 a transcation fraud if sender , receive,amount are same and time stamp diffrecence <=60 sec
  print all fraud transactions
  example: anu jain,1000,1234567890
  gagan jain,1000,1234567890
  kiran jain,1000,1234567890
  kiran jain,1000,1234567890
  */

class Transaction {

    String sender;
    String receiver;
    int amount;
    long timestamp;

    public Transaction(String sender, String receiver, int amount, long timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return sender + " -> " + receiver +
                " Amount: " + amount +
                " Time: " + timestamp;
    }
}

public class Q1 {
    public static void main(String[] args) {
        List<Transaction> list = Arrays.asList(
                new Transaction("anu", "jain", 1000, 100),
                new Transaction("gagan", "jain", 1000, 100),
                new Transaction("kiran", "jain", 1000, 100),
                new Transaction("kiran", "jain", 1000, 150),
                new Transaction("kiran", "jain", 1000, 170));

        List<Transaction> fraud = findFraudTransactions(list);

        for (Transaction t : fraud) {
            System.out.println(t);
        }
    }

    static List<Transaction> findFraudTransactions(List<Transaction> transactions) {
        Map<String, List<Transaction>> map = new HashMap<>();
        Set<Transaction> fraud = new LinkedHashSet<>();
        for (Transaction t : transactions) {
            String key = t.sender + "#" + t.receiver + "#" + t.amount;
            if (map.containsKey(key)) {
                for (Transaction prev : map.get(key)) {
                    if (Math.abs(t.timestamp - prev.timestamp) <= 60) {
                        fraud.add(prev);
                        fraud.add(t);
                    }
                }
            }
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(t);
        }

        return new ArrayList<>(fraud);
    }
}
