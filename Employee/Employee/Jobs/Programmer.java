package Employee.Employee.Jobs;

import Employee.Employee.Employee;
import Holiday.Days;

public class Programmer extends Employee<String, Integer> {
    private Days<String> holiday;

    public Programmer() {
        super();
        System.out.println("I'm a Programmer");
        this.holiday = new Days<>();
    }

    public void setHoliday(String day) {
        holiday.setDay(day);
    }

    public void displayHoliday() {
        holiday.displayHoliday();
    }

    // overloading method
    public void skill() {
        System.out.println("No Skill.");
    }

    public void skill(String... language) {
        for (String items : language)
            System.out.println("skill = " + items);
    }

    // overriding method
    public void bonus() {
        System.out.println("BONUS : 20%");
    }
}
