package UniversityHotelRoom;
class HostelRoom {
    String roomNumber;
    String studentName;
    // Default Constructor
    HostelRoom() {
        roomNumber = "Not Assigned";
        studentName = "Vacant";
    }
    // Method to allocate room
    void allocateRoom(String room, String student) {
        roomNumber = room;
        studentName = student;
        System.out.println("Room " + roomNumber + " allocated to " + studentName);
    }
    // Method to vacate room
    void vacateRoom() {
        System.out.println("Room " + roomNumber + " vacated by " + studentName);
        roomNumber = "Not Assigned";
        studentName = "Vacant";
    }
    // Method to display room details
    void display() {
        System.out.println("Room Number: " + roomNumber + ", Assigned Student: " + studentName);
    }
}