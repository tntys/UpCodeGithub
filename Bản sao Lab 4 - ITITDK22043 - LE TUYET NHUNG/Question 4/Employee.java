import java.util.Date;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private Date dateOfJoining;

    public Employee(String name, int id, Date dateOfJoining) {
        this.name = name;
        this.id = id;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    @Override
    public int compareTo(Employee other) {
        return this.dateOfJoining.compareTo(other.dateOfJoining);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", dateOfJoining=" + dateOfJoining + "}";
    }
}
