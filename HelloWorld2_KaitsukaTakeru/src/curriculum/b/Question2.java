package curriculum.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {

    public static void main(String[] args) {
        try {
            Question2 q = new Question2();
            q.question6();
            q.question7();
            q.question8();
        } catch (IOException e) {
            System.out.println("入力エラーが発生しました。");
        }
    }

    //Q6
    public void question6() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("【Q6】数字を1つ入力してください: ");
        String input = reader.readLine();

        try {
            int number = Integer.parseInt(input);
            if (number % 2 == 0) {
                System.out.println(number + " は偶数です");
            } else {
                System.out.println(number + " は奇数です");
            }
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
        }
    }

    //Q7
    public void question7() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("【Q7】0から100の数値を入力してください: ");
        
        try {
            String input = reader.readLine();
            int score = Integer.parseInt(input);

            if (score >= 90) {
                System.out.println("優");
            } else if (score >= 70) {
                System.out.println("良");
            } else if (score >= 50) {
                System.out.println("可");
            } else {
                System.out.println("不可");
            }
        } catch (NumberFormatException e) {
            System.out.println("有効な数値を入力してください。");
        }
    }

    //Q8
    public void question8() throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("値を入力してください: ");

        String input = reader.readLine();

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
            return;
        }

        char code = input.charAt(0);

        if (Character.isDigit(code)) {
        	
            int num = Character.getNumericValue(code);
            
            if (num % 2 == 0) {
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        } else {
            System.out.println("数字を入力してください。");
        }
    }
}