package curriculum.k;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("山田太郎", 160, new FullTimeStrategy());
        Employee emp2 = new Employee("佐藤次郎", 140, new ContractStrategy());

        SalaryReporter reporter = new SalaryReporter();

        List<Employee> employees = List.of(emp1, emp2);

        for (Employee e : employees) {
            reporter.report(e);
        }
    }
}