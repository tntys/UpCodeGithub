import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee;

    public Project(String projectId, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        listOfEmployee.add(emp);
    }

    public int estimateBudget() {
        int totalBudget = 0;
        for (Employee emp : listOfEmployee) {
            totalBudget += emp.calculateWeeklySalary();
        }
        return totalBudget;
    }

    public String toString() {
        String result = ""; 
       
        result += "Project ID: " + projectId + "\n";
    
        for (Employee emp : listOfEmployee) {
            result += emp.toString() + "\n"; 
        }

        result += "Estimated Budget: " + estimateBudget();
    
        return result; 
    }
}
