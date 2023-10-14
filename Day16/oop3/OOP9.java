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
	// 1) 접근제어를 건드려서 필드를 이용할 수 있도록 조정한다.
	// - 메서드를 대상으로 설정하고, 필드에는 거의 적용하지 않는다.
	// 2) 접근제어를 건드리되, 준비된 getter/setter에 적용한다.
	// - 캡슐화는 필드를 보호(무분별한 직접적인 사용을 방지)하는 것을 의미함.
	// - 패키지를 통해서 이를 이용할 수 있는 클래스를 제한시켜준다.
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
		Mover person = new Mover("김춘식");
		person.move(rock1, 3, 3, 3);
		person.find(rock1);
	}
}
