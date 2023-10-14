package tech1;

abstract class Box {
	protected String name;
	protected boolean state;
	// 생성자는 준비할 수 있고, 안할 수 있다.
	// 준비하면, 무조건 호출해야 하고
	// 준비안하면, 기본생성자가 자동으로 준비되니 호출하지 않아도 됨
	public Box(String name) { this.name = name; }
	public void open() { state = true; }
	public void close() { state = false; }
	// 추상메서드 - 본문이 존재하지 않는 메서드 -> 오버라이딩을 무조건 해야 함
	public abstract void check();
}
// 일반 클래스와 추상 클래스 문법은 교차해서 사용할 수 없으니 주의
class BoxA extends Box {
	private int data;
	public BoxA(int data) {
		super("정수상자");
		this.data = data;
	}
	public void check() {
		System.out.println(name + " : " + data);
	}
}
class BoxB extends Box {
	private double data;
	public BoxB(double data) {
		super("정수상자");
		this.data = data;
	}
	public void check() {
		System.out.println(name + " : " + data);
	}
}

public class Abs1 {
	public static void main(String[] args) {
		BoxA box1 = new BoxA(100);
		BoxB box2 = new BoxB(3.14);
		box1.check();
		box2.check();
		// 1. 부모클래스로 객체 생성이 안된다 - 클래스 사용간의 실수를 줄일 수 있음.
		// -> 부모클래스는 순수한 청사진(Blue Print)용도로만 사용된다.
		// 2. 그러면서 업캐스팅 / 다운캐스팅은 가능하도록 만들어 쓰는 것.
		// -> 참조변수의 준비는 가능하다.
		Box box3 = box1;
		Box box4 = box2;
		box3.check();
		box4.check();
		// 주의사항 : 자식에서 특정 필드의 사용을 예측하고 준비할 수 없음
		//         -> 매개변수를 준비하는 순간, 해당 매개변수가 반드시 있어야 함
		//         단, 반환형은 일부러 통제할 수 있음
	}
}