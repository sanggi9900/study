package oop2;

class Cat {
	private String name;
	private String spec;
	// 생성자 : 객체를 생성할 때 자동으로 호출되는 메서드
	// - public 클래스명(매개변수 필요한 만큼) { ... }
	// - 반환형 없음
	// 1) 기본생성자 : 매개변수가 없는 생성자
	public Cat() {
		name = "야옹이";
		spec = "시고르자브종";
	}
	// 2) 생성자 : 매개변수가 있는 생성자
	public Cat(String name, String spec) {
		this.name = name;
		this.spec = spec;
	}
	// 3) 복사생성자 : 동일한 클래스의 객체로 새로운 객체를 만드는 생성자
	public Cat(Cat that) {
		// 주의사항 - 비원시 멤버는 공유가 되어버리니 주의....
		this.name = that.name;	// 비원시는 다른 것을 이용하여 복사효과를 낸다.
		this.spec = that.spec;	// 원시일 경우 무조건 복사되니 필요한 효과를 얻을 수 있음.
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	public String getSpec() { return spec; }
}
public class OOP6 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("루비", "뱅갈고양이");
		Cat cat3 = new Cat(cat2);
		System.out.println(cat3 + " " + cat2);
		System.out.println(cat1.getName() + " : " + cat1.getSpec());
		System.out.println(cat2.getName() + " : " + cat2.getSpec());
		System.out.println(cat3.getName() + " : " + cat3.getSpec());
	}
}
