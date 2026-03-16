package curriculum.b;

public class Main {
	public static void main(String[] args) {
		// Animalクラスのインスタンスを作成
        Animal lion = new Animal();

        // setterを使って値を設定
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // getterを使って値を取得し、出力
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}