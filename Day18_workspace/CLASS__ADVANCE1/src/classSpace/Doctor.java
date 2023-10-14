package classSpace;

public class Doctor extends Human {
	private String part;
	
	public Doctor(String name, String part) {
		super(name, "의사", 0);
		this.part = part;
	}
	// 오버라이딩은 오로지 상속에서만 성립함
	public String getName() {
		return "의사 " + name;
	}
	public String getRoll() {
		return "진료분야 : " + part;
	}
	// 오버로딩은 기본적으로 이름이 같은 상태에서 매개변수가 다르면 성립함
	public void greeting(Human that) {
		System.out.println(that.name + "님 안녕하세요. " + name + "입니다.");
	}
}
