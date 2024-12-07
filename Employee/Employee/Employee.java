package Employee.Employee;

public abstract class Employee<T, U> {
    private T value;
    private String name;
    private U balance;

    // Constructor
    public Employee() {
    }

    // Constructor with name and balance
    public Employee(String name, U balance) {
        this.name = name;
        this.balance = balance;
        this.displayEmployee();
    }

    // Setter methods
    public void setValue(T value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(U balance) {
        this.balance = balance;
    }

    // Getter methods
    public T getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public U getSalary() {
        return balance;
    }

    // Abstract method for bonus calculation
    public abstract void bonus();

    // Display employee details
    public void displayEmployee() {
        System.out.println("ID: " + this.getValue());
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + this.getSalary());
    }
}
