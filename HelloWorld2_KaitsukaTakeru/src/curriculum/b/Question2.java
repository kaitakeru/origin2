package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("1〜7の数値を入力してください: ");
        // コンソール入力を int 型の変数 day に代入
        int day = scanner.nextInt();
        
        // switch文による条件分岐
        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            case 7:
                System.out.println("日曜日");
                break;
            default:
                // 1〜7以外の値が入力された場合
                System.out.println("無効な入力です");
                break;
        }
        
        scanner.close();
		}
	}