package myclass;

public class Box {
	private String name;
	private boolean state;
	
	public Box() { this("���� - BŸ��", false); }
	public Box(String name) { this(name, false); }
	public Box(boolean state) {	this("���� - AŸ��", state); }
	public Box(String name, boolean state) {
		this.name = name;
		this.state = state;
	}
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	public boolean getStatus() { return state; }
	
	public void open() {
		if (!state) {
			state = true;
			System.out.println(name+"��(/��) ���ϴ�.");
		}
	}
	public void close() {
		if (state) {
			state = false;
			System.out.println(name+"��(/��) �ݽ��ϴ�.");
		}
	}
	public void showInfo() {
		System.out.println(name + " : " + state);
	}
}
