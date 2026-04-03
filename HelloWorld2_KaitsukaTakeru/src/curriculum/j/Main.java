package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Billable> billingList = new ArrayList<>();

        billingList.add(new FullTimeEmployee("F101", "山田太郎"));
        billingList.add(new ContractEmployee("C201", "佐藤次郎"));
        billingList.add(new FullTimeEmployee("F102", "田中三郎"));

        int hours = 9;

        for (Billable b : billingList) {

            int cost = b.costForDay(hours);

            if (b instanceof Employee) {
                System.out.println(((Employee) b).getName() + "の日給: " + cost + " 円");
            } else {
                System.out.println("日給: " + cost + " 円");
            }
        }
    }
}