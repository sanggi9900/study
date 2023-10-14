package oop3;

class Tank {
	private String name;
	private int hp;
	public Tank(String name) {
		this.name = name;
		hp = 100;
	}
	public void attack(Tank that) {
		that.hp -= 10; // 따로 get/set 필요없음
	}
	public void Info() { System.out.println(name + " : " + hp); }
}

public class OOP10 {
	public static void main(String[] args) {
		Tank tankA = new Tank("A탱크");
		Tank tankB = new Tank("B탱크");
		tankA.Info(); tankB.Info();
		tankA.attack(tankB); // A가 B에게 동작을 행한다 -> B가 A에게 동작을 당했다
		tankA.Info(); tankB.Info();
		tankB.attack(tankA); // B가 A에게 동작을 행한다 -> A가 B에게 동작을 당했다
		tankA.Info(); tankB.Info();
	}
}
