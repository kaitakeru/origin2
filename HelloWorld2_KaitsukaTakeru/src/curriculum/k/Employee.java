package curriculum.k;

public class Employee {
    private String name;
    private int hours;
    private SalaryStrategy strategy;

    public Employee(String name, int hours, SalaryStrategy strategy) {
        this.name = name;
        this.hours = hours;
        this.strategy = strategy;
    }

    public String getName() { return name; }
    public int getSalary() {
        return strategy.calculate(hours);
    }
}
class SalaryReporter {
    public void report(Employee e) {
        System.out.println(e.getName() + " の給料は " + e.getSalary() + " 円");
    }
}