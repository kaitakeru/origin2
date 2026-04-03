package curriculum.b;

public class Question5 {

    public void helloWorld() {
        System.out.println("Hello, World!");
    }

    public int doubleValue(int num) {
        return num * 2;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Question5 q = new Question5();

        // Q1
        q.helloWorld();

        // Q2
        int input = 10;
        int result = q.doubleValue(input);
        System.out.println(input + " を 2 倍すると " + result + " です。");

        // Q3
        int num1 = 7;
        int num2 = 10;
        if (q.isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }
        if (q.isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }

        // Q4
        Greeting greeting = new Greeting();
        greeting.sayHello();

        // Q5
        Animal lion = new Animal();
        lion.setName("ライオン");
        lion.setLength("2.1m");
        lion.setSpeed("80km/h");

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength());
        System.out.println("速度：" + lion.getSpeed());

    }
}