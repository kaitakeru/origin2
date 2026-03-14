package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		// 1. 2次元配列を用意
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        // 2. 合計値を入れる変数を用意
        int totalSum = 0;
        
        // 3. 拡張for文で全て足す
        for (int[] row : array) {      // 各「行」を取り出す
            for (int num : row) {      // 行の中の各要素を取り出す
                totalSum += num;       // 合計に加算
            }
        }
        
        // 4. 結果を表示
        System.out.println("すべての要素の合計値は: " + totalSum);
            }
	}