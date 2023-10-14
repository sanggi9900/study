package oop1;
// 클래스는 기본적으로 공유되는 설계도이기 때문에
// 이름의 중복을 허용하지 않는다.
class Box2{
	String name;	// 특성 - 상자명
	boolean state;	// 특성 - 상자의 상태
	void open() {	// 메서드 - 상자 열기
		if (!state) {
			state = true;
			System.out.println(name+"을(/를) 엽니다.");
		}
	}
	void close() {	// 메서드 - 상자 닫기
		if (state) {
			state = false;
			System.out.println(name+"을(/를) 닫습니다.");
		}
	}
}
public class AbstractEX2 {
	public static void main(String[] args) {
		Box2 box1 = new Box2();
		Box2 box2 = new Box2();
		box1.name = "상자1";
		box1.state = false;
		box2.name = "상자2";
		box2.state = true;
		System.out.println(box1.name + " : " + box1.state);
		System.out.println(box2.name + " : " + box2.state);
		box1.open();
		box2.close();
		System.out.println(box1.name + " : " + box1.state);
		System.out.println(box2.name + " : " + box2.state);
	}
}
