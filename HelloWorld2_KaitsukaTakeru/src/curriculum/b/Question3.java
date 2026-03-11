package curriculum.b;

public class Question3 {

	public static void main(String[] args) {
		int sum = 0; // 合計を入れるための箱
        int i = 1;   // 1からスタート

        while (i <= 100) {
            sum += i; 
            i++;
        }

        System.out.println("1から100までの合計は " + sum + " です。");
        }
	}