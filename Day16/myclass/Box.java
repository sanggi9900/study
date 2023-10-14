package myclass;

public class Box {
	protected String name;
	protected boolean state;
	
	public Box() { this("상자 - B타입", false); }
	public Box(String name) { this(name, false); }
	public Box(boolean state) {	this("상자 - A타입", state); }
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
			System.out.println(name+"을(/를) 엽니다.");
		}
	}
	public void close() {
		if (state) {
			state = false;
			System.out.println(name+"을(/를) 닫습니다.");
		}
	}
	public void showInfo() {
		System.out.println(name + " : " + state);
	}
	public String toString() {
		return name;
	}
}
