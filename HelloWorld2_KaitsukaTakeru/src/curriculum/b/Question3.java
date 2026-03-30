package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
//Q6
        int i6 = 1;
        while (i6 <= 10) {
            System.out.println(i6);
            i6++;
        }
//Q7
        int i7 = 2;
        while (i7 <= 20) {
            System.out.println(i7);
            i7 += 2;
        }
//Q8
        int i8 = 10;
        while (i8 >= 1) {
            System.out.println(i8);
            i8--;
        }

//Q9
        int i9 = 1;
        int sum = 0;
        while (i9 <= 100) {
            sum += i9;
            i9++;
        }
        System.out.println("1から100までの合計は " + sum + " です");

//Q10
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        System.out.println("数値を入力してください（0で終了）:");
        while (num != 0) {
            System.out.print("入力: ");
            num = scanner.nextInt();
        }
        System.out.println("終了しました");

//Q11
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%02d * %02d = %02d", i, j, i * j);
                if (j < 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }

//Q12
        Random random = new Random();
        System.out.println("商品名を「、」区切りで入力してください：");
        scanner.nextLine(); 
        String input = scanner.nextLine();
        
        String[] items = input.split("、");
        int tvCount = random.nextInt(12);
        int displayCount = 11 - tvCount;

        for (String item : items) {
            String target = item.trim();
            switch (target) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(target + "の残り台数は " + random.nextInt(12) + "台です");
                    break;
                case "テレビ":
                case "ディスプレイ":
                    int count = target.equals("テレビ") ? tvCount : displayCount;
                    System.out.println(target + "の残り台数は " + count + "台です");
                    break;
                default:
                    System.out.println("『 " + target + " 』は指定の商品ではありません");
                    break;
            }
        }
        scanner.close();
		}
}