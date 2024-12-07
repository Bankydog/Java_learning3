package Employee.Employee.Jobs;

import Employee.Employee.Employee;
import Holiday.Days;

public class Accounting extends Employee<String, Integer> {
    public String skill = "monney menagement";
    private Days<String> holiday;

    public Accounting(String name, Integer salary) {
        super(name, salary);
        System.out.println("I'm a Accounting");
        this.holiday = new Days<>();
    }

    public void setHoliday(String day) {
        holiday.setDay(day);
    }

    public void displayHoliday() {
        holiday.displayHoliday();
    }

    // overriding method
    public void bonus() {
        System.out.println("BONUS : 20%");
    }

}
