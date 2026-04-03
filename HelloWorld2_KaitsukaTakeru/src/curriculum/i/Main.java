package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new FullTimeEmployee("F001", "山田太郎"));
		employeeList.add(new ContractEmployee("C001", "佐藤次郎"));
		employeeList.add(new FullTimeEmployee("F002", "田中三郎"));

		int hoursWorked = 9;

		for (Employee emp : employeeList) {
			int wage = emp.calculateDailyWage(hoursWorked);
			System.out.println(emp.name + "の給料: " + wage + " 円");
		}
	}
}