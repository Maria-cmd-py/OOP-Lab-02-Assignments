package SmartHomeLightControl;
public class Main {
    public static void main(String[] args) {
        SmartLight light1 = new SmartLight(); // Create object
        light1.setRoom("Living Room"); // Set room name
        light1.turnOn(); // Turn light on
        light1.display(); // Display status
        light1.turnOff(); // Turn light off
        light1.display(); // Display updated status
    }
}