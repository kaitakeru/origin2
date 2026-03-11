package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("商品を入力してください（「、」区切り）:");
        String inputLine = scanner.nextLine();

        // 入力された値を「、」で区切って配列に格納
        String[] items = inputLine.split("、");

        // テレビとディスプレイの合計を11にするためのランダム値生成
        int tvStock = random.nextInt(12); // 0～11
        int displayStock = 11 - tvStock;

        // 拡張for文
        for (String item : items) {
        	
            String trimmedItem = item.trim();
            
            // Switch文
            switch (trimmedItem) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    // 条件演算子を使用、残り台数を生成・表示
                    //普通のif文は使用不可、ここで完結
                    System.out.println(trimmedItem + "の残り台数は " + random.nextInt(12) + "台です");
                    break;

                case "テレビ":
                case "ディスプレイ":
                    // テレビとディスプレイは続けて書き、条件演算子で出力値を変更
                    int stock = trimmedItem.equals("テレビ") ? tvStock : displayStock;
                    System.out.println(trimmedItem + "の残り台数は " + stock + "台です");
                    break;

                default:
                    // 指定の商品以外の場合
                    System.out.println("『 " + trimmedItem + " 』は指定の商品ではありません");
                    break;
            }
        }
        scanner.close();
        }
	}