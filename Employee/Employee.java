package Employee;

public class Employee<T, U> {
    private T value;
    private String name;
    private U balace;

    public void setValue(T value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(U balace) {
        this.balace = balace;
    }

    public T getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public U getSalary() {
        return balace;
    }

    public void displayEmployee() {
        System.out.println("id : " + this.getValue());
        System.out.println("Name : " + this.getName());
        System.out.println("Salary : " + this.getSalary());
    }
}