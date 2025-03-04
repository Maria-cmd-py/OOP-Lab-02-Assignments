package HospitalManagmentSystem;
class Patient {
    String name;
    int age;
    String disease;
    // Default Constructor
    Patient() {
        name = "Unknown";
        age = 0;
        disease = "Not Assigned";
    }
    // Method to add patient details
    void addPatient(String n, int a, String d) {
        name = n;
        age = a;
        disease = d;
    }
    // Method to update disease
    void updateDisease(String d) {
        disease = d;
        System.out.println("Disease updated for " + name);
    }
    // Method to display patient details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }
}