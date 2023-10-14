package test;

public class Doctor extends AbsHuman  {
	private String part;
	public Doctor(String name, String part) {
		super(name);
		this.part = part;
	}
	public void introduce() {
		System.out.println("난 증상을 치료할 수 있는 의사, "
				+ name + "입니다.");
	}
	public void report() {
		System.out.println("내 담당분야는 " + part + "입니다.");
	}
}
