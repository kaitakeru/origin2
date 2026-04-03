package curriculum.k;

class FullTimeStrategy implements SalaryStrategy {
@Override
 public int calculate(int hours) {
     return hours * 1200;
 	}
}

class ContractStrategy implements SalaryStrategy {
@Override
 public int calculate(int hours) {
     return hours * 1000;
 	}
}