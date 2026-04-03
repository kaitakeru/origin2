package curriculum.h;

public class PartTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1000;

    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}