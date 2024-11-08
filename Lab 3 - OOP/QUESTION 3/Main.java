import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        
        // // test person
        // Person person1 =  new Person(null, null);
        // Person person2 = new Person("null", "ABS");

        // System.out.println(person1);
        // System.out.println(person2);
        // System.out.println();

        // // test student
        // Student01 student1 = new Student01(null, null, null, 0, 0);
        // Student01 student2 = new Student01("null", "123 ABC", "Computer Engineering", 3, 1000000);

        // System.out.println(student1);
        // System.out.println(student2);

        // // test staff
        // Staff staff1 = new Staff(null, null, null, 0);
        // Staff staff2 = new Staff("null", "null", "null", 192038);

        // System.out.println(staff2);
        // System.out.println(staff1);

        Scanner input = new Scanner(System.in);
        // Student
        
        System.out.println("Please enter the data of Student!");
        System.out.print("Student's name: ");
        String studentName = input.nextLine();
        System.out.print("Student's address: ");
        String studentAddress = input.nextLine();
        System.out.print("Student's program:  ");
        String program = input.nextLine();
        System.out.print("Student's year: ");
        int year = input.nextInt();
        System.out.print("Student's program fee: ");
        double fee = input.nextDouble();
        
        Student01 student = new Student01(studentName, studentAddress, program, year, fee);
        System.out.println(student);
        System.out.println();

        input.nextLine();

        // Staff
        System.out.println("Please enter the data for Staff");
        System.out.print("Staff's name: ");
        String staffName = input.nextLine();
        System.out.print("Staff's address: ");
        String staffAddress = input.nextLine();
        System.out.print("Staff's school: ");
        String school = input.nextLine();
        System.out.print("Staff's pay: ");
        double pay = input.nextDouble();
        
        Staff staff = new Staff(staffName, staffAddress, school, pay);
        System.out.println(staff);
        System.out.println();
    }
}
