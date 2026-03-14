package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		// 1. 2次元配列を用意
        int[][] array = {
            {12, 15, 8},
            {6, 19, 25},
            {30, 2, 10}
        };

        // 2. 最大値と最小値を、（[0][0]）でセット
        int max = array[0][0];
        int min = array[0][0];

        // 3. 拡張for文で全要素を比較
        for (int[] row : array) {      // 各行を取り出す
            for (int num : row) {      // 行の中の各要素を取り出す
                // 最大値
                if (num > max) {
                    max = num;
                }
                // 最小値
                if (num < min) {
                    min = num;
                }
            }
        }

        // 4. 結果表示
        System.out.println("最大値は: " + max);
        System.out.println("最小値は: " + min);
            }
	}