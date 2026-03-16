package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("1つ目の数値を入力してください: ");
        int x = sc.nextInt(); // 3. 入力を受け取る

        System.out.print("2つ目の数値を入力してください: ");
        int y = sc.nextInt();

        System.out.print("3つ目の数値を入力してください: ");
        int z = sc.nextInt();

        // 最大値の判定ロジック
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }

        System.out.println("一番大きい数値は " + max + " です");

        sc.close();
		}
	}