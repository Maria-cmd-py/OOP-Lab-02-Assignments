package OnlineShoppingCart;
import java.util.ArrayList;
class ShoppingCart {
    ArrayList<String> itemNames = new ArrayList<>();
    ArrayList<Double> itemPrices = new ArrayList<>();
    // Method to add item to cart
    void addItem(String name, double price) {
        itemNames.add(name);
        itemPrices.add(price);
        System.out.println("Added: " + name + " - $" + price); }
    // Method to remove item from cart
    void removeItem(String name) {
        int index = itemNames.indexOf(name);
        if (index != -1) {
            itemNames.remove(index);
            itemPrices.remove(index);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Item not found in cart!"); } }
    // Method to display cart details
    void display() {
        double total = 0;
        System.out.println("Cart Items:");
        for (int i = 0; i < itemNames.size(); i++) {
            System.out.println(itemNames.get(i) + " - $" + itemPrices.get(i));
            total += itemPrices.get(i); }
        System.out.println("Total Price: $" + total); } }