package oop3;

class Tank {
	private String name;
	private int hp;
	public Tank(String name) {
		this.name = name;
		hp = 100;
	}
	public void attack(Tank that) {
		that.hp -= 10; // ���� get/set �ʿ����
	}
	public void Info() { System.out.println(name + " : " + hp); }
}

public class OOP10 {
	public static void main(String[] args) {
		Tank tankA = new Tank("A��ũ");
		Tank tankB = new Tank("B��ũ");
		tankA.Info(); tankB.Info();
		tankA.attack(tankB); // A�� B���� ������ ���Ѵ� -> B�� A���� ������ ���ߴ�
		tankA.Info(); tankB.Info();
		tankB.attack(tankA); // B�� A���� ������ ���Ѵ� -> A�� B���� ������ ���ߴ�
		tankA.Info(); tankB.Info();
	}
}
