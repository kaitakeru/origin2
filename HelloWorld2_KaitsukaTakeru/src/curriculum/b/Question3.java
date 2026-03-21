package curriculum.b;

public class Question3 {

	public static void main(String[] args) {
//Q1
		for (int i = 1; i <= 10; i++) {
            System.out.println(i);
		}
//Q2
		for (int i = 2; i <= 20; i += 2) {
		    System.out.println(i);
		}
//Q3
		for (int i = 10; i >= 1; i--) {
		    System.out.println(i);
		}
//Q4
		int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1から100までの合計は: " + sum);
//Q5
		for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            	System.out.println();
		}
	}
}