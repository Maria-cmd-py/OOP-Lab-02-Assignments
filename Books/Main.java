package Books;
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setDetails("Java Programming", "James Gosling", 3);
        b1.borrowBook();
        b1.returnBook();
    }
}