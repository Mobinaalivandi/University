import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Book> books = new HashMap<>();
        while (true) {
            System.out.println("Welcome ! choose an option from the menu below :");
            System.out.println("1. Add book");
            System.out.println("2. Search book");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("5.Show all books");
            System.out.println("6. Show borrowed books");
            System.out.println("7. Exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Enter the index of the book : ");
                int index = input.nextInt();
                input.nextLine();
                System.out.println("Enter title of the book : ");
                String title = input.nextLine();
                System.out.println("Enter author of the book : ");
                String author = input.nextLine();
                Book o = new Book(title, author);
                books.put(index, o);
                System.out.println("Book added successfully");

            } else if (choice == 2) {
                System.out.println("Enter the index of the book you're looking for : ");
                int in = input.nextInt();
                if (books.containsKey(in)) {
                    System.out.println("Title of the book : " + books.get(in).gettitle());
                    System.out.println("Author of the book : " + books.get(in).getauthor());
                    System.out.println("The book has been borrowed : " + books.get(in).getborrowed());
                } else {
                    System.out.println("No book with this index exist's");                }

            } else if (choice == 3) {
                System.out.println("Enter the index of the book you want to borrow");
                int in = input.nextInt();
                if (books.containsKey(in)) {
                    books.get(in).borrowbook();
                } else {
                    System.out.println("No book with this index exist's");
                }

            } else if (choice == 4) {
                System.out.println("Enter the index of the book you want to return");
                int in = input.nextInt();
                if (books.containsKey(in)) {
                    books.get(in).returnbook();
                } else {
                    System.out.println("No book with this index exist's");
                }

            } else if (choice == 5) {
                for (Map.Entry<Integer, Book> b : books.entrySet()) {
                    System.out.println("The book :" + " "+ b.getKey() +" " + "," + b.getValue());
                }

            } else if (choice == 6) {
                boolean find = false;
                for (Map.Entry<Integer, Book> b : books.entrySet()) {
                    if (b.getValue().getborrowed()) {
                        System.out.println("The book :" + " "+ b.getKey() +" " + "," + b.getValue());
                        find = true;
                    }
                }
                if (!find) {
                    System.out.println("No book has been borrowed");
                }

            } else if (choice == 7) {
                System.out.println("You have chosen to exit . Goodbye");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
