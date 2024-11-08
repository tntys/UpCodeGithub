import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "123 Main St", "Computer Science", 2023, 15000.50);
        Student student2 = new Student("Jane Smith", "456 Oak Ave", "Mathematics", 2024, 13000.75);

        Staff staff1 = new Staff("Dr. Alan Brown", "789 Elm St", "Science Department", 80000.50);
        Staff staff2 = new Staff("Mrs. Emily Davis", "101 Pine St", "Human Resources", 60000.75);

        System.out.println("Individual objects:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(staff1);
        System.out.println(staff2);

        student1.setFee(15500.25);
        staff1.setPay(85000.00);
        System.out.println("\nAfter updating information:");
        System.out.println(student1);
        System.out.println(staff1);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(staff1);
        staffList.add(staff2);

        System.out.println("\nList of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\nList of Staff:");
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }
}
