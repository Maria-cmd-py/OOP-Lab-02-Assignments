package Books;
class Book {
    String title;
    String author;
    int availableCopies;
    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        availableCopies = 0; }
    // Method to set book details
    void setDetails(String t, String a, int copies) {
        title = t;
        author = a;
        availableCopies = copies; }
    // Method to borrow a book
    void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available!"); } }
    // Method to return a book
    void returnBook() {
        availableCopies++;
        System.out.println("Book returned: " + title); }
}
