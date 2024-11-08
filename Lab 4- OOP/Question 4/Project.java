import java.util.ArrayList;
import java.util.Collections;

public class Project {
    private String projectName;
    private ArrayList<Employee> employees;

    public Project(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortEmployeesByJoiningDate() {
        Collections.sort(employees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Project: " + projectName + "\nEmployees:\n");
        for (Employee employee : employees) {
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }
}
