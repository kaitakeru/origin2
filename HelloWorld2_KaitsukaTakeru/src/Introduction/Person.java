package Introduction;

class Person {
	public String name;
	public int age;
	public double height;
	public double weight;

	public static int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		Person.count++;
	}

	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" + this.bmi() + "です");
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}