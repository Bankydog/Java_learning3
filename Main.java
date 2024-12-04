import java.time.DayOfWeek;
import Employee.Employee;
import Holiday.Days;

public class Main {
    // Attribute
    public static void main(String[] args) {
        Employee<String, Integer> e1 = new Employee<>("001", "Bank", 30000); // Create employee 1
        e1.displayEmployee();

        Days<DayOfWeek> d1 = new Days<>();
        d1.setDay(DayOfWeek.MONDAY);
        d1.displayHoliday();

        ////////////////////////////////////////////////////

        Employee<String, Integer> e2 = new Employee<>();// Create employee 2
        System.out.println("before edit : " + e2.getSalary());
        e2.setValue("002");
        e2.setName("BOW");
        e2.setSalary(5000);
        e2.displayEmployee();

        Days<DayOfWeek> d2 = new Days<>();
        d2.setDay(DayOfWeek.SUNDAY);
        d2.displayHoliday();

        ////////////////////////////////////////////////////

        Employee<String, Integer> e3 = new Employee<>();// Create employee 3
        e3.displayEmployee();
        Days<DayOfWeek> d3 = new Days<>();
        // d3.setDay(DayOfWeek.SUNDAY);
        d3.displayHoliday();
    }

}
