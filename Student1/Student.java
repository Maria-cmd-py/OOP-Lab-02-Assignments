package Student1;
class Student {
    String name;
    int age;
    String grade;
    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        grade = "Not Assigned";
    }
    // Method to enroll a student
    void enrollStudent(String n, int a, String g) {
        name = n;
        age = a;
        grade = g;
    }
    // Method to update grade
    void updateGrade(String g) {
        grade = g;
        System.out.println("Grade updated for " + name);
    }
    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

