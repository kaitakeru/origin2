package curriculum.b;

public class Animal {
	
    private String name;
    private double length;
    private int speed;

    // 動物名のgetter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 体長のgetter/setter
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    // 速度のgetter/setter
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}