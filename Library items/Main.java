import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<LibraryItem> l = new ArrayList<>();
        while (true) {
            System.out.println("Welcome ! choose an option from the menu below : ");
            System.out.println("1. Add book ");
            System.out.println("2. List all ");
            System.out.println("3. Display details ");
            System.out.println("4. Check out ");
            System.out.println("5. Return ");
            System.out.println("6. Exit");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                int n = input.nextInt();
                input.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter the book's title :");
                    String title = input.nextLine();
                    System.out.println("Enter the book's Id :");
                    String itemId = input.nextLine();
                    System.out.println("Enter the book's author :");
                    String author = input.nextLine();
                    System.out.println("Enter the book's number of pages :");
                    int pages = input.nextInt();
                    input.nextLine();
                    Book b = new Book(title, itemId, author, pages);
                    l.add(b);
                    System.out.println("Book number" + " " + (i + 1) + " " + "added");
                }
            } else if (choice == 2) {
                for (int i = 0; i < l.size(); i++) {
                    System.out.println("Index of the book :" + " " + i);
                    System.out.println("Title of the book :" + " " + l.get(i).gettitle());
                    System.out.println("The book has been checked out:" + " " + l.get(i).getisCheckedOut());
                }
            } else if (choice == 3) {
                System.out.println("Enter the index of the book you're looking for : ");
                int index = input.nextInt();
                if (index >= 0 && index < l.size()) {
                    l.get(index).displayDetails();
                } else {
                    System.out.println("The index you have entered is invalid");
                }
            } else if (choice == 4) {
                System.out.println("Enter the index of the book you want to check out : ");
                int index = input.nextInt();
                if (index >= 0 && index < l.size()) {
                    l.get(index).checkOut();
                } else {
                    System.out.println("The index you have entered is invalid");
                }
            } else if (choice == 5) {
                System.out.println("Enter the index of the book you want to return : ");
                int index = input.nextInt();
                if (index >= 0 && index < l.size()) {
                    l.get(index).returnItem();
                } else {
                    System.out.println("The index you have entered is invalid");
                }
            } else if (choice == 6) {
                System.out.println("You have chosen to exit . Goodbye ! ");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
