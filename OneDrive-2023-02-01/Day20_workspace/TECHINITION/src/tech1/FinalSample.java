package tech1;

class unit {
	// 1) 필드에서 설정하기 -> 배열 객체의 length 필드
	// 생성자에서 값을 초기화(저장)를 할 수 있음
	protected final String name;
	public unit() {
		name = "유닛";
	}
	// 그 외에서는 이를 수정할 수 없음
	// public void setName(String name) { this.name = name; }
	public final String getName() { return name; }
}
class Knight extends unit {
	public Knight() {}
	public void action() { System.out.println(name + " : WRYYYYYY!!!!"); }
	// 2) 메서드에 설정하기
	// - 해당 메서드를 수정할 수 없으며, 오버라딩도 허용하지 않는다.
	// public String getName() { return "기사" + name; }	
}

public class FinalSample {
	public static void main(String[] args) {
		// final 키워드 : 변하면 곤란한 것을 통제하는 키워드
		Knight knight1 = new Knight();
		knight1.action();
	}
}
