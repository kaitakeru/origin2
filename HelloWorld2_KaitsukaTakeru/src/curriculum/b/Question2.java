package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("何か入力してください: ");

        String input = sc.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力された文字: " + input);
        }
        sc.close();
		}
	}