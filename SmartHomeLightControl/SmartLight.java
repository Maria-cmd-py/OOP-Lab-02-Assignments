package SmartHomeLightControl;
class SmartLight {
    String roomName;
    boolean isOn;
    // Default Constructor
    SmartLight() {
        roomName = "Unknown";
        isOn = false;
    }
    // Method to set room name
    void setRoom(String room) {
        roomName = room;
    }
    // Method to turn light on
    void turnOn() {
        isOn = true;
        System.out.println("Light in " + roomName + " is ON.");
    }
    // Method to turn light off
    void turnOff() {
        isOn = false;
        System.out.println("Light in " + roomName + " is OFF.");
    }
    // Method to display light status
    void display() {
        System.out.println("Room: " + roomName + ", Light Status: " + (isOn ? "ON" : "OFF"));
    }
}