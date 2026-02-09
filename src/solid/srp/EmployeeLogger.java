package solid.srp;

public class EmployeeLogger {

    public void logEmployeeDetails(Employee employee) {
        System.out.println("Logging employee details: " + employee.getName() + ", " + employee.getSalary());
    }
}
