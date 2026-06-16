public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title , String itemId , String author , int pages) {
        super(title , itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("The book's title : " + " " + gettitle());
        System.out.println("The book's Id : " + " " + getitemId());
        System.out.println("The book's author : " + " " + author);
        System.out.println("The book's number of pages : " + " " + pages);
        System.out.println("The book has been checked out : " + " " + getisCheckedOut());
    }
}

