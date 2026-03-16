package curriculum.b;

public class Question2 {

    public static void main(String[] args) {
/*Q1*/
        int score = 75; 
        if (score >= 60) {
            System.out.println("合格です！");
        }

 /*Q2*/
        int age2 = 25; 
        if (age2 >= 20 && age2 <= 30) {
            System.out.println("適正年齢です");
        } else {
            System.out.println("対象外です");
        }
    
/*Q3*/
        int age3 = 18; 
        if (age3 >= 20) {
            System.out.println("成人です");
        } else if (age3 >= 13) {
            System.out.println("ティーンエイジャーです");
        } else {
            System.out.println("子供です");
        }
    
/*Q4*/
        int x = 30;
        int y = 15;
        int z = 50;
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println("一番大きい数値は: " + max);

/*Q5*/
       
        int num = Integer.parseInt(args[0]);

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0 です");
        } else {
            System.out.println("負の数です");
        }
    	}
/*Q6*/
    	public Question2() throws java.io.IOException {
        super();
        
        System.out.print("数字を1つ入力してください: ");

        int code = System.in.read();

        if (code >= 48 && code <= 57) {
            if (code % 2 == 0) {
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        } else {
            System.out.println("数字を入力してください。");
        }
        }
		
/*Q7*/{
		System.out.print("0から100の数値を入力してください: ");

		int score = 0;
		int ch;

		while ((ch = System.in.read()) != '\n' && ch != '\r' && ch != -1) {
		if (ch >= '0' && ch <= '9') {
        score = score * 10 + (ch - '0');
		}
		}
		if (score >= 90) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		}
		
/*Q8*/{
		System.out.print("値を入力してください: ");

		int code = System.in.read();

		if (code == -1 || code == 10 || code == 13) {
			System.out.println("入力が無効です");
		} else {
			if (code >= 48 && code <= 57) {
        if (code % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
		} else {
        System.out.println("数字を入力してください。");
    	}
		}
		}
		}