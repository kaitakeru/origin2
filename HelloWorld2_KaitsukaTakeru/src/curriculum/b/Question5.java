package curriculum.b;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Scannerは直接使わない
        Scanner scanner = new Scanner(System.in);
        
        // メソッド
        helloWorld();
        
        scanner.close();
    }

    /**
     * 条件：引数なし、戻り値なし
     * "Hello, World!" を表示する
     */
    public static void helloWorld() {
        System.out.println("Hello, World!");
	}
}
