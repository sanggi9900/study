package oop3;

class Rock {
	private int x;
	private int y;
	private int z;
	public Rock(int x, int y, int z) {
		this.x = x; this.y = y; this.z = z;
	}
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public void setZ(int z) { this.z = z; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public int getZ() { return this.z; }
}
class Mover {
	private String name;
	public Mover(String name) {
		this.name = name;
	}
	// 1) ������� �ǵ���� �ʵ带 �̿��� �� �ֵ��� �����Ѵ�.
	// - �޼��带 ������� �����ϰ�, �ʵ忡�� ���� �������� �ʴ´�.
	// 2) ������� �ǵ帮��, �غ�� getter/setter�� �����Ѵ�.
	// - ĸ��ȭ�� �ʵ带 ��ȣ(���к��� �������� ����� ����)�ϴ� ���� �ǹ���.
	// - ��Ű���� ���ؼ� �̸� �̿��� �� �ִ� Ŭ������ ���ѽ����ش�.
	public void move(Rock that, int x, int y, int z) {
		that.setX(that.getX() + x); // that.x = that.x + x;
		that.setY(that.getY() + y); // that.y = that.y + y;
		that.setZ(that.getZ() + z); // that.z = that.z + z;
	}
	public void find(Rock that) {
		System.out.println(that.getX() + " " + that.getY() + " " + that.getZ());
	}
}

public class OOP9 {
	public static void main(String[] args) {
		Rock rock1 = new Rock(0,0,0);
		Mover person = new Mover("�����");
		person.move(rock1, 3, 3, 3);
		person.find(rock1);
	}
}
