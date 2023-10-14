package myclass;
// 클래스의 접근제어 : 어디까지 쓸 수 있나? public이 일반적으로 붙는다.
public class Box {
	// 멤버의 접근제어 : 어디까지 쓸 수 있나? 클래스의 접근제어와는 다르니 주의.
	// - 클래스의 접근제어 : 다른 패키지에서 이용 가능 여부
	// - 멤버의 접근제어 : 객체가 생성된 이후에 이용가능 여부
	private String name;	// 특성 - 상자명
	private boolean state;	// 특성 - 상자의 상태
	public void open() {	// 메서드 - 상자 열기
		if (!state) {
			state = true;
			System.out.println(name+"을(/를) 엽니다.");
		}
	}
	public void close() {	// 메서드 - 상자 닫기
		if (state) {
			state = false;
			System.out.println(name+"을(/를) 닫습니다.");
		}
	}
}
