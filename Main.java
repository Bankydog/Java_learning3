import java.time.DayOfWeek;
import Employee.Employee;
import Holiday.Days;

public class Main {
    // Attribute
    public static void main(String[] args) {
        Employee<String, Integer> e1 = new Employee<>(); // Create employee 1
        e1.setValue("001");
        e1.setName("Bank");
        e1.setSalary(30000);
        e1.displayEmployee();

        Days<DayOfWeek> d1 = new Days<>();
        d1.setDay(DayOfWeek.MONDAY);
        d1.displayHoliday();

        ////////////////////////////////////////////////////

        Employee<String, Integer> e2 = new Employee<>();// Create employee 2
        e2.setValue("002");
        e2.setName("Bow");
        e2.setSalary(45000);
        e2.displayEmployee();

        Days<DayOfWeek> d2 = new Days<>();
        d2.setDay(DayOfWeek.SUNDAY);
        d2.displayHoliday();
    }

}
