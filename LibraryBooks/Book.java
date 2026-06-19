public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public boolean getborrowed() {
        return borrowed;
    }

    public void borrowbook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book already borrowed");
        }
    }

    public void returnbook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book already returned");
        }
    }

    @Override
    public String toString() {
        return "Title :" + title + ", Author : " + author + ", Has been borrowed : " + borrowed;
    }
}