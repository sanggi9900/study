package myclass;
// 클래스의 접근제어 : 어디까지 쓸 수 있나? public이 일반적으로 붙는다.
public class Box {
	// 멤버의 접근제어 : 어디까지 쓸 수 있나? 클래스의 접근제어와는 다르니 주의.
	// - 클래스의 접근제어 : 다른 패키지에서 이용 가능 여부
	// - 멤버의 접근제어 : 객체가 생성된 이후에 이용가능 여부
	private String name;	// 특성 - 상자명
	private boolean state;	// 특성 - 상자의 상태
	// 생성자 - 오버로딩으로 준비됨
	public Box() {
		// this의 용도2 : 생성자 호출용
		this("상자 - B타입", false);
		// 주의사항 : 무조건 최우선으로 호출되어야 함
	}
	public Box(String name) {
		this(name, false);
	}
	public Box(boolean state) {
		this("상자 - A타입", state);
	}
	public Box(String name, boolean state) {
		this.name = name;
		this.state = state;
	}
	// getter와 setter는 적절하게 한쪽에 몰아서 분류하는게 편함
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(boolean status) {
		this.state = status;
	}
	public String getName() {
		return name;
	}
	public boolean getStatus() {
		return state;
	}
	// 기능 메서드
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
	public void showInfo() {
		System.out.println(name + " : " + state);
	}
}
