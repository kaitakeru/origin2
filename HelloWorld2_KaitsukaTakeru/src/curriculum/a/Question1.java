package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// 1. int型の変数 a に 10 を代入
        int a = 10;
        
        // 2. int型の変数 b に 20 を代入
        int b = 20;

        // 3. a が b より小さいかどうかを条件演算子を使って判定し、result に代入
        // 書式: 条件式 ? 真の場合の値 : 偽の場合の値
        boolean result = (a < b) ? true : false;

        // 4. result の値を表示
        System.out.println("a < b の結果: " + result);
	}
}