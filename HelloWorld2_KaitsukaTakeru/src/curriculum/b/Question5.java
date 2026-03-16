package curriculum.b;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Scannerの準備
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("整数を入力してください: ");
        // 整数を入力
        int input = scanner.nextInt();
        
        // メソッド呼び出し
        int result = doubleValue(input);
        
        // 実行例のように表示
        System.out.println(input + " を 2 倍すると " + result + " です。");
        
        scanner.close();
    }

    /**
     * 引数の整数を2倍するメソッド
     */
    public static int doubleValue(int num) {
        return num * 2;
	}
}
