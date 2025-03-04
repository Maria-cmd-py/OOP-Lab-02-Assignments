package OnlineShoppingSystem;
class Customer {
    String name;
    double balance;
    double cartTotal;
    // Default Constructor
    Customer() {
        name = "Unknown";
        balance = 0.0;
        cartTotal = 0.0; }
    // Method to set customer details
    void setDetails(String n, double b) {
        name = n;
        balance = b; }
    // Method to add items to the cart
    void addToCart(double amount) {
        cartTotal += amount;
        System.out.println("Added to cart: " + amount); }
    // Method to checkout
    void checkout() {
        if (cartTotal > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= cartTotal;
            System.out.println("Purchase successful! Remaining balance: " + balance);
            cartTotal = 0; } }
}