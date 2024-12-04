package Employee;

public class Employee<T, U> {
    private T value;
    private String name;
    private U balance;

    public Employee() {

    }

    public Employee(T value, String name) {

    }

    public Employee(T value, String name, U balance) {
        this.value = value;
        this.name = name;
        this.balance = balance;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(U balance) {
        this.balance = balance;
    }

    public T getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public U getSalary() {
        return balance;
    }

    public void displayEmployee() {
        System.out.println("id : " + this.getValue());
        System.out.println("Name : " + this.getName());
        System.out.println("Salary : " + this.getSalary());
    }
}