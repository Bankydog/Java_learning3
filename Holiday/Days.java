package Holiday;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Days<T> {
    private T day;

    public void setDay(T day) {
        this.day = day;
    }

    public T getday() {
        return day;
    }

    public void displayHoliday() {
        System.out.println("Holiday : " + this.getday());
        System.out.println("-------------------------------------------");
    }
}
