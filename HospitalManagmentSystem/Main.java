package HospitalManagmentSystem;
public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(); // Create object
        p1.addPatient("Ali", 25, "Fever"); // Add patient details
        p1.display(); // Display details
        p1.updateDisease("Cough"); // Update disease
        p1.display(); // Display updated details
    }
}