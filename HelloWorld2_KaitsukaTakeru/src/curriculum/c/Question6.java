package curriculum.c;

import java.util.Random;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		Cpu cpu = new Cpu();

		System.out.println("じゃんけんゲーム！勝つまで終われません。");

		while (true) {

			System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
			int input = scanner.nextInt();
			player.setHand(input);

			cpu.generateHand();

			System.out.println("あなたの手: " + player.getHandName());
			System.out.println("CPUの手: " + cpu.getHandName());

			int result = (player.getHand() - cpu.getHand() + 3) % 3;

			if (result == 2) {
				printMessage(player.getHand());
				System.out.println("あなたの勝ち！");
				break; // ループ終了
			} else if (result == 1) {
				System.out.println("あなたの負け…もう一度！");
			} else {
				System.out.println("あいこ！もう一度！");
			}
			System.out.println("---");
		}
		scanner.close();
	}

	public static void printMessage(int hand) {
		switch (hand) {
		case 0 -> System.out.println("【一撃必殺のグー！】");
		case 1 -> System.out.println("【鋭い切れ味のチョキ！】");
		case 2 -> System.out.println("【全てを包み込むパー！】");
		}
	}
}

class Player {
	private int hand;
	private final String[] HAND_NAMES = { "グー", "チョキ", "パー" };

	public void setHand(int hand) {
		this.hand = hand;
	}

	public int getHand() {
		return hand;
	}

	public String getHandName() {
		return (hand >= 0 && hand <= 2) ? HAND_NAMES[hand] : "不明な手";
	}
}

class Cpu {
	private int hand;
	private final Random random = new Random();
	private final String[] HAND_NAMES = { "グー", "チョキ", "パー" };

	public void generateHand() {
		this.hand = random.nextInt(3);
	}

	public int getHand() {
		return hand;
	}

	public String getHandName() {
		return HAND_NAMES[hand];
	}
}