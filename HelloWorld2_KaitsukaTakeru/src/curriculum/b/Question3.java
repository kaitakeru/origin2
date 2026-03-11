package curriculum.b;

import java.util.Scanner; // Scannerを使う

public class Question3 {

	public static void main(String[] args) {
		// Scannerの準備
        Scanner scanner = new Scanner(System.in);
        
        int input = -1;

        System.out.println("数字を入力してください（0で終了）:");

        while (input != 0) {
            System.out.print("入力 > ");
            input = scanner.nextInt();
        }

        System.out.println("終了しました");
        
        // Scannerを閉じる
        scanner.close();
        }
	}