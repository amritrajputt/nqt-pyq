import java.util.Scanner;

public class Add2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        Node head1 = null;
        Node tail1 = null;
        for (int i = 0; i < len1; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            // phle head bnaya
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                // fir tail pe new node add kiya and tail ko aage krte gya
                tail1.next = newNode;
                tail1 = newNode;
            }
        }
        Node head2 = null;
        Node tail2 = null;
        for (int i = 0; i < len2; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            // phle head bnaya
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                // fir tail pe new node add kiya and tail ko aage krte gya
                tail2.next = newNode;
                tail2 = newNode;
            }
        }
        Node ans = addNumber(head1, head2);
        while(ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
        sc.close();
    }

    static Node addNumber(Node head1, Node head2) {
        int carry = 0;
        Node ansHead = new Node(-1);
        Node ansTail = ansHead;

        while (head1 != null || head2 != null || carry > 0) {
            int sum = 0;
            // because our condition is something that head = null then also for head2 and
            // carry program
            // have to run so keep a check so that null point exception doesn't come
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }

            sum += carry;
            int digit = sum % 10;

            Node newNode = new Node(digit);
            ansTail.next = newNode;
            ansTail = newNode;

            carry = sum / 10;
        }
        ansHead = ansHead.next;
        return ansHead;
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
