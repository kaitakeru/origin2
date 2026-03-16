package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("数値を入力してください: ");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
        	
            System.out.println("奇数です");
        }
        sc.close();
		}
	}