public abstract class LibraryItem {
    private String title;
    private String itemId;
    private boolean isCheckedOut;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isCheckedOut = false;
    }

    public String gettitle() {

        return title;
    }

    public String getitemId() {

        return itemId;
    }

    public boolean getisCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Book checked out successfully");
        } else {
            System.out.println("This book is already checked out");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("This book is already returned");
        }
    }

    public abstract void displayDetails();
}

