package inheritance;

public class Employee extends Person {
    private String employeeId;
    private String title;

    public Employee() {
        // if it only super(), default constructor is called instead
        super("John");
        System.out.println("Employee created");
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
