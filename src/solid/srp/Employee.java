package solid.srp;


public class Employee {
    /* Badly  implemented class violating SRP as it has multiple responsibilities */
//    private String name;
//    private double salary;
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public void saveToDatabase() {
//        System.out.println("Saving employee to database...");
//        // Database logic here
//    }
//
//    public void logEmployeeDetails() {
//        System.out.println("Logging employee details: " + name + ", " + salary);
//    }

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() {return salary;}

}
