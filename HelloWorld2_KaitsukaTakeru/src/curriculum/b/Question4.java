package curriculum.b;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        
//Q1
        System.out.println("--- Q1 ---");
        int[] numbers1 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

//Q2
        System.out.println("\n--- Q2 ---");
        int[] numbers2 = { 10, 20, 30, 40, 50 };
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.println(numbers2[i]);
        }

//Q3
        System.out.println("\n--- Q3 ---");
        int[] numbers3 = { 3, 5, 7, 9, 11 };
        int sum3 = 0;
        for (int i = 0; i < numbers3.length; i++) {
            sum3 += numbers3[i];
        }
        System.out.println("合計値: " + sum3);

//Q4
        System.out.println("\n--- Q4 ---");
        int[] numbers4 = { 12, 7, 9, 21, 5, 18 };
        int max4 = numbers4[0];
        int min4 = numbers4[0];
        for (int i = 1; i < numbers4.length; i++) {
            if (numbers4[i] > max4) {
                max4 = numbers4[i];
            }
            if (numbers4[i] < min4) {
                min4 = numbers4[i];
            }
        }
        System.out.println("最大値: " + max4);
        System.out.println("最小値: " + min4);

 //Q5
        System.out.println("\n--- Q5 ---");
        int[] numbers5 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers5.length; i++) {
            numbers5[i] = numbers5[i] * 2;
        }
        for (int num : numbers5) {
            System.out.println(num);
        }

//Q6
        System.out.println("\n--- Q6 ---");
        int[] numbers6 = { 4, 7, 10, 15, 20 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("調べたい数値を入力してください: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int num : numbers6) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(target + " は配列に含まれています");
        } else {
            System.out.println(target + " は配列に含まれていません");
        }

//Q7
        System.out.println("\n--- Q7 ---");
        int[][] array7 = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                System.out.print(array7[i][j] + " ");
            }
            System.out.println();
        }

//Q8
        System.out.println("\n--- Q8 ---");
        int[][] array8 = {
            { 10, 20, 30 },
            { 40, 50, 60 },
            { 70, 80, 90 }
        };
        int totalSum8 = 0;
        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                totalSum8 += array8[i][j];
            }
        }
        System.out.println("すべての要素の合計値: " + totalSum8);

//Q9
        System.out.println("\n--- Q9 ---");
        int[][] array9 = {
            { 12, 15, 8 },
            { 6, 19, 25 },
            { 30, 2, 10 }
        };
        int max9 = array9[0][0];
        int min9 = array9[0][0];
        for (int i = 0; i < array9.length; i++) {
            for (int j = 0; j < array9[i].length; j++) {
                if (array9[i][j] > max9) max9 = array9[i][j];
                if (array9[i][j] < min9) min9 = array9[i][j];
            }
        }
        System.out.println("最大値: " + max9);
        System.out.println("最小値: " + min9);

//Q10
        System.out.println("\n--- Q10 ---");
        int[][][] array10 = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        for (int i = 0; i < array10.length; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                for (int k = 0; k < array10[i][j].length; k++) {
                    System.out.print(array10[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----");
        }

        scanner.close();
    }
}