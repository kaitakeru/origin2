package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("数値を入力してください: ");
        // 1. コンソール入力から数値を受け取る
        int num = sc.nextInt();

        // 2. 条件分岐で判定
        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0 です");
        } else {
            // 0より大きいでもなく、0でもない場合（＝0より小さい）
            System.out.println("負の数です");
        }
        sc.close();
		}
	}