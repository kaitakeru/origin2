package curriculum.b;

public class Question3 {

	public static void main(String[] args) {
		//1の段から9の段まで
        for (int i = 1; i <= 9; i++) {
            
            // 1から9をかける
            for (int j = 1; j <= 9; j++) {
            
            System.out.printf("%02d * %02d = %02d", i, j, i * j);
                
            // 最後の列以外には、区切り線の " || " を付ける
            if (j < 9) {
                    System.out.print(" || ");
                }
            }
            
            // 1つの段が終わったら改行
            System.out.println();
        }
	}
}