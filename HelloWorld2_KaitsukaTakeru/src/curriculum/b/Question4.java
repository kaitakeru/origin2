package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		// 1. 3次元配列を用意
        int[][][] array = {
            {
                {1, 2}, 
                {3, 4}
            }, 
            {
                {5, 6}, 
                {7, 8}
            }
        };

        // 2. 拡張for文で全要素を表示
        for (int[][] area : array) {
            for (int[] row : area) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println(); // 行が終わったら改行
            }
            System.out.println("----"); //区切り
        }
	}
}