package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class Entity {
	String name;
	int hp;
	int at;
	int sp;

	public Entity(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public boolean isAlive() {
		return this.hp > 0;
	}
}

public class Question7 {
	private static final String LOG_FILE = "battle_log.txt";
	private static final String DAEMON_FILE = "daemon_status.txt";
	private static final Random rand = new Random();

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Playerの名前を入力してください: ");
			String playerName = sc.nextLine();

			Entity player = new Entity(
					playerName, 
					rand.nextInt(51) + 50, 
					rand.nextInt(11) + 10,
					rand.nextInt(10) + 1
			);

			Entity daemon = loadDaemon();
			if (daemon == null) {
				System.out.println("Daemonデータの読み込みに失敗しました。");
				return;
			}

			System.out.println("\n--- ステータス ---");
			showStatus(player);
			showStatus(daemon);
			System.out.println("----------------\n");

			executeBattle(player, daemon);
		}
	}

	public static Entity loadDaemon() {
		try (BufferedReader br = new BufferedReader(new FileReader(DAEMON_FILE))) {
			String name = br.readLine();
			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());
			return new Entity(name, hp, at, sp);
		} catch (IOException | NumberFormatException e) {
			System.out.println("読み込みエラー: " + e.getMessage());
			return null;
		}
	}

	public static void executeBattle(Entity p1, Entity p2) {
		StringBuilder log = new StringBuilder();
		log.append("バトル開始!\n");

		Entity first, second;
		
		if (p1.sp > p2.sp) {
			first = p1;
			second = p2;
		} else if (p2.sp > p1.sp) {
			first = p2;
			second = p1;
		} else {
			if (rand.nextBoolean()) {
				first = p1;
				second = p2;
			} else {
				first = p2;
				second = p1;
			}
		}

		log.append("先攻: " + first.name + " (SP: " + first.sp + ")\n\n");

		int turn = 1;
		while (p1.isAlive() && p2.isAlive()) {
			log.append("--- Turn " + turn + " ---\n");
			attack(first, second, log);
			if (!second.isAlive()) break;
			attack(second, first, log);
			turn++;
		}

		String winner = p1.isAlive() ? p1.name : p2.name;
		log.append("\n" + winner + " の勝利！\n");
		System.out.println(log.toString());
		saveLog(log.toString());
	}

	private static void attack(Entity attacker, Entity defender, StringBuilder log) {
		defender.hp -= attacker.at;
		log.append(attacker.name + " の攻撃！ " + defender.name + " に " + attacker.at + " のダメージ！\n");
		log.append(defender.name + " の残りHP: " + Math.max(0, defender.hp) + "\n");
	}

	private static void saveLog(String content) {
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(LOG_FILE)))) {
			pw.println(content);
			System.out.println("結果を " + LOG_FILE + " に保存しました。");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void showStatus(Entity e) {
		System.out.println(e.name + " [HP:" + e.hp + " AT:" + e.at + " SP:" + e.sp + "]");
	}
}