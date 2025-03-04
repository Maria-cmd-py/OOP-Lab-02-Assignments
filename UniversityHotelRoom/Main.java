package UniversityHotelRoom;
public class Main {
    public static void main(String[] args) {
        HostelRoom room1 = new HostelRoom(); // Create object
        room1.allocateRoom("101", "Ali"); // Allocate room
        room1.display(); // Display details
        room1.vacateRoom(); // Vacate room
        room1.display(); // Display updated details
    }
}