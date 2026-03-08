package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// 元の文章を代入
        String text = "私はJavaが好きです。Javaは楽しい！";

        // 「Java」 を 「Python」 に置き換える
        String newText = text.replace("Java", "Python");

        // 結果表示
        System.out.println(newText);
	}
}