import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Employee {
    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public int calculateWeeklySalary() {
        return salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2);
    }

    public int compareTo(Employee other) {
        if (this.noOfTravelDay == other.noOfTravelDay) {
            return Integer.compare(this.noOfLeavingDay, other.noOfLeavingDay);
        }
        return Integer.compare(this.noOfTravelDay, other.noOfTravelDay);
    }

    public String toString() {
        return "Name: " + employeeName + " - Salary Per Hour: " + salaryPerHour + " - Weekly Salary: " + calculateWeeklySalary();
    }
}