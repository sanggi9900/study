package test;

public class Doctor extends AbsHuman  {
	private String part;
	public Doctor(String name, String part) {
		super(name);
		this.part = part;
	}
	public void introduce() {
		System.out.println("�� ������ ġ���� �� �ִ� �ǻ�, "
				+ name + "�Դϴ�.");
	}
	public void report() {
		System.out.println("�� ���оߴ� " + part + "�Դϴ�.");
	}
}
