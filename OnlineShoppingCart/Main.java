package OnlineShoppingCart;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(); // Create object
        cart1.addItem("Laptop", 1000); // Add item
        cart1.addItem("Mouse", 20); // Add item
        cart1.display(); // Display cart
        cart1.removeItem("Mouse"); // Remove item
        cart1.display(); // Display updated cart
    }
}