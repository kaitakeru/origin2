package curriculum.h;

public class FullTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    public int calculateDailyWage(int hoursWorked) {
        if (hoursWorked > 8) {
            int regularPay = 8 * HOURLY_RATE;
            int overtimeHours = hoursWorked - 8;
            int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);
            return regularPay + overtimePay;
        } else {
            return hoursWorked * HOURLY_RATE;
        }
    }
}