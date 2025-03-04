package Student1;
public class main {
    public static void main(String[] args) {
        Student s1 = new Student(); // Create object
        s1.enrollStudent("Ali", 20, "A"); // Enroll student
        s1.display(); // Display details
        s1.updateGrade("A+"); // Update grade
        s1.display(); // Display updated details
    }
}