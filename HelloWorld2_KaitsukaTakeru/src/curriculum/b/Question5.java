package curriculum.b;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Scannerの準備（固定値を使用）
        Scanner scanner = new Scanner(System.in);
        
        // 変数の設定
        int num1 = 7;
        int num2 = 10;
        
        // num2 (10) の判定と表示
        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }
        
        // num1 (7) の判定と表示
        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }
        
        scanner.close();
    }

    /**
     * 引数が偶数かを判定するメソッド
     */
    public static boolean isEven(int num) {
        // 2で割った余りが0なら偶数
        return num % 2 == 0;
	}
}
