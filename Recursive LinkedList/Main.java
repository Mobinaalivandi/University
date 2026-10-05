import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = input.nextInt();
        System.out.println("Enter value :");
        int s = input.nextInt();
        Node head = new Node(s);
        Node tail = head;
        for (int i = 1; i < n; i++) {
            System.out.println("Enter value :");
            s = input.nextInt();
            Node m = new Node(s);
            tail.next = m;
            tail = m;
        }
        System.out.println("Enter the value you want to remove : ");
        int value = input.nextInt();
        Node check = head;
        boolean found = false;
        while (check != null) {
            if (check.d == value) {
                found = true;
                break;
            }
            check = check.next;
        }
        if (found) {
            head = head.remove(head, value);
            System.out.println("Updated list:");
            while (head != null) {
                System.out.println(head.d + " ");
                head = head.next;
            }
        } else {
            System.out.println("Value does not exist");
        }
    }
}
