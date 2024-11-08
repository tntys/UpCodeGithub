import java.util.Scanner;
public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Project ID: ");
        String projectId = sc.nextLine();

        System.out.print("Enter Project Start Date (dd/MM/yyyy): ");
        Date startDate = new Date(sc.nextLine());

        System.out.print("Enter Project End Date (dd/MM/yyyy): ");
        Date endDate = new Date(sc.nextLine());

        Project project = new Project(projectId, startDate, endDate);

        System.out.print("How many employees? ");
        int numEmployees = sc.nextInt();

        for (int i = 0; i < numEmployees; i++) {
            sc.nextLine(); 

            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Employee ID: ");
            String empId = sc.nextLine();

            System.out.print("Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Salary Per Hour: ");
            int salaryPerHour = sc.nextInt();

            System.out.print("Number of Leaving Days: ");
            int noOfLeavingDay = sc.nextInt();

            System.out.print("Number of Travel Days: ");
            int noOfTravelDay = sc.nextInt();

            Employee employee = new Employee(empId, empName, salaryPerHour, noOfLeavingDay, noOfTravelDay);
            project.addEmployee(employee);
        }

        System.out.println("Project Details:\n" + project.toString());
        sc.close();
    }
}