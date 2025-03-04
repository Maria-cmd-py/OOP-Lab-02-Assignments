package OnlineShoppingSystem;
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setDetails("Sara", 5000);
        c1.addToCart(2000);
        c1.checkout();
    }
}