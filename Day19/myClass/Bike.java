package myClass;

public class Bike implements Drivable  {
	private String name;
	public Bike(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println(interfaceName);
		System.out.println(name + " : Bike Class");
	}
	public void drive() {
		System.out.println(name + " : 질주를 시작합니다!!");
	}
	public void stop() {
		System.out.println(name + " : 질주를 멈췄습니다!!");
	}
}
