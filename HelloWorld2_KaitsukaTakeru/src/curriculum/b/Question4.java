package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		// 1. 2次元配列を用意
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        
        // 2. for文で全要素を表示
        for (int i = 0; i < array.length; i++) {         
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
            }
        }
    }
}