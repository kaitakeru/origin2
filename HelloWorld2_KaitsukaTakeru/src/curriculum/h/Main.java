package curriculum.h;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("F001", "山田太郎");
        PartTimeEmployee pt = new PartTimeEmployee("P001", "鈴木花子");

        int hours = 9;

        System.out.println("正社員の給与: " + ft.calculateDailyWage(hours) + " 円");
        System.out.println("パート社員の給与: " + pt.calculateDailyWage(hours) + " 円");
    }
}
