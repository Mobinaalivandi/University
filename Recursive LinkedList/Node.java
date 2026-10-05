public class Node {
    int d;
    Node next;

    public Node(int d) {
        this.d = d;
    }

    public Node remove(Node head, int value) {
        if (head == null) {
            System.out.println("Value doesn't exist");
            return head;
        }
        if (head.d == value) {
            head = head.next;
            return head;
        }
        head.next = remove(head.next, value);
        return head;
    }
}
