import java.util.Scanner;

public class Q34 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        head = reverseKNode(head, k);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        sc.close();
    }

    private static Node reverseKNode(Node head, int k) {

        if (head == null) {
            return null;
        }

        Node curr = head;
        Node prev = null;
        for (int i = 0; i < k && curr != null; i++) {
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;

        }
        head.next = reverseKNode(curr, k);
        return prev;
    }
}

class Node {
    int val;
    Node next;

    Node(int node) {
        this.val = node;
        this.next = null;
    }

}
