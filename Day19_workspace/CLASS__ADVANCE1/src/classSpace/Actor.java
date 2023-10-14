package classSpace;

public class Actor extends Human {
	public Actor(String name) {
		// 기본 생성자가 없으면 무조건 부모 생성자를 호출해야 함
		super(name, "배우", 0);
	}
	// 메서드 오버라이딩 - 기존 메서드 갈아치우기
	// - 무조건 동일해야 함
	// - 다르게 쓰는 것을 허용하지 않음
	public void greeting() {
		// 부모의 메서드가 마음에 안드니 재정의를 함
		// # 부모의 동작에 보충해서 쓰고 싶은 경우...
		//   super 접두사로 이를 호출할 수 있음
		super.greeting();
		System.out.println("잘나가는 배우입니다.");
	}
}
