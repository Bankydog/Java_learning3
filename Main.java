import Employee.Employee.Jobs.Accounting;
import Employee.Employee.Jobs.Programmer;

public class Main {
    // Attribute
    public static void main(String[] args) {

        //////////////////////////////////////////////////// // Create Programmer 3
        Programmer p1 = new Programmer();
        p1.setHoliday("Sunday");
        p1.skill("JAVA", "C#", "Python");
        p1.displayHoliday();

        Accounting a1 = new Accounting("Bow", 50000);
        a1.setValue("005");
        a1.setHoliday("Saturday");
        a1.displayEmployee();
        a1.displayHoliday();
    }

}
