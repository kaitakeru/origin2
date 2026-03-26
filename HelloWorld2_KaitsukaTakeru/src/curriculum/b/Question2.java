package curriculum.b;

import java.util.Scanner;

public class Question2 {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Question2 q = new Question2();
		q.question6();
		q.question7();
		q.question8();
		q.question9();
		q.question10();

	}

	//Q6
	public void question6() {
		System.out.print("【Q6】数字を1つ入力してください: ");
		String input = scanner.nextLine();
		try {
			int number = Integer.parseInt(input.trim());
			System.out.println(number + (number % 2 == 0 ? " は偶数です" : " は奇数です"));
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください。");
		}
	}

	//Q7
	public void question7() {
		System.out.print("【Q7】0から100の数値を入力してください: ");
		String input = scanner.nextLine();
		try {
			int score = Integer.parseInt(input.trim());
			if (score >= 90)
				System.out.println("優");
			else if (score >= 70)
				System.out.println("良");
			else if (score >= 50)
				System.out.println("可");
			else
				System.out.println("不可");
		} catch (NumberFormatException e) {
			System.out.println("有効な数値を入力してください。");
		}
	}

	//Q8
	public void question8() {
		System.out.print("【Q8】値を入力してください: ");
		String input = scanner.nextLine();

		if (input == null || input.trim().isEmpty() || input.trim().equals("null")) {
			System.out.println("入力が無効です");
			return;
		}

		try {
			int num = Integer.parseInt(input.trim());
			System.out.println(num % 2 == 0 ? "偶数です" : "奇数です");
		} catch (NumberFormatException e) {

			System.out.println("数字を入力してください。");
		}
	}

	//Q9
	public void question9() {
		System.out.print("【Q9】1〜7の数値を入力してください: ");

		String input = scanner.nextLine();

		try {

			int day = Integer.parseInt(input.trim());

			switch (day) {
			case 1:
				System.out.println("月曜日");
				break;
			case 2:
				System.out.println("火曜日");
				break;
			case 3:
				System.out.println("水曜日");
				break;
			case 4:
				System.out.println("木曜日");
				break;
			case 5:
				System.out.println("金曜日");
				break;
			case 6:
				System.out.println("土曜日");
				break;
			case 7:
				System.out.println("日曜日");
				break;
			default:

				System.out.println("無効な入力です");
				break;
			}
		} catch (NumberFormatException e) {

			System.out.println("無効な入力です");
		}
	}

	//Q10
	public void question10() {
		System.out.print("【Q10】1〜12の数値を入力してください: ");
		String input = scanner.nextLine();
		try {
			int month = Integer.parseInt(input.trim());
			switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("冬");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋");
				break;
			default:
				System.out.println("無効な月です");
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("無効な月です");
		}
	}
}