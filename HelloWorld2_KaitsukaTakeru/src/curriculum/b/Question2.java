package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("0から100のスコアを入力してください: ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("優");
        } else if (score >= 70) {

            System.out.println("良");
        } else if (score >= 50) {

            System.out.println("可");
        } else {

            System.out.println("不可");
        }
        sc.close();
		}
	}