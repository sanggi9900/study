package myclass;

public class IntBox extends Box {
	// 필드에는 값을 미리 넣어둘 수 있음
	// - 많이 사용되는 값을 넣는다.
	private int data = 0;
	// 생성자 준비시 주의사항 : 부모클래스의 기본생성자
	// - 기본 생성자는 암묵적(자동)으로 호출된다.
	// - 그 외 생성자는 명시적(수동)으로 호출해야 함.
	// - 부모의 기본생성자가 없으면 무조건 부모의 다른 생성자를
	//   호출해야 한다는 제약이 생긴다.
	public IntBox() {
		super("정수상자0");
	}
	public IntBox(String name) {
		super(name);
	}
	public IntBox(String name, int data) {
		super(name);
		this.data = data;
	}
	
	public void setData(int data) {
		if (state) {
			this.data = data;
			System.out.println(name + " - 저장성공...");
		}
		else {
			System.out.println(name + " - 저장실패...");
		}
	}
	public int getData() {
		if (state) {
			return data;
		}
		else {
			return -1;
		}
	}
	
	// 재정의 : 마음에 안드니 새로 만들어냄
	public void showInfo() {
		if (state) {
			System.out.println(name + " : " + data);
		}
		else {
			System.out.println(name+"이(/가) 닫혀 있습니다.");
		}
	}

}












