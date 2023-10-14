package oop4;
//부모클래스(Super Class) - 넓은 개념
class Animal {
	// 필드는 protected / 메서드는 public을 이용
	protected String name;
	public Animal(String name) { this.name = name; }
	public void move() {
		System.out.println(name+"가 이동합니다.");
	}
}
// 자식클래스(Sub Class) - 구체화된 개념
class Dog extends Animal {
	private String barkSound;
	public Dog(String name, String sound) {
		// super : 부모의 것을 사용하기 위한 예약어
		// this : 자신의 것을 사용하기 위한 예약어
		// 부모 생성자는 제일 최상단에서 먼저 호출되어야 함
		super(name); 
		barkSound = sound;
	}
	// 부모의 것을 상속받았다면 자식은 이를 그대로 이용할 수 있음
	public void bark() {
		System.out.println(name + " : " + barkSound);
	}
}
// 자식클래스는 필요하면 여럿이 될 수 있다.
class Bird extends Animal {
	// 필드명은 같은 이름도 가능함. 권장하지 않음...
	private String name;
	public Bird(String name1, String name2) {
		super(name1);
		// 같은 이름이면 해당 클래스의 필드가 우선순위를 가진다.
		name = name2;
	}
	public void show() {
		// 같은 이름일 때 구분은 super / this를 이용한다.
		System.out.println(this.name + " - " + super.name);
	}
	// 메서드 오버라이딩 : 메서드명/반환/매개변수를 완전히 동일하게 맞춰서 준비
	// - 해당 메서드를 재정의하는 것
	public void move() {
		System.out.println(name + " : 펄럭펄럭 ~ !");
		// 오버라이딩을 한다고 해도 super로 호출 가능
		super.move();
	}
}

public class OOP11 {
	public static void main(String[] args) {
		// 객체지향의 상속성
		// - 객체를 만들기 위한 클래스를 재활용할 수 있다.
		// - 개념을 구현한 클래스를 확장할 수 있다.
		Animal ani1 = new Animal("환상의 동물");
		Dog dog1 = new Dog("치와와", "왈왈왈왈");
		Bird bird1 = new Bird("송골매","구구");
		ani1.move();
		dog1.bark();	// 자식클래스의 새로운 메서드
		dog1.move();	// 부모클래스의 기존 메서드
		bird1.show();
		bird1.move();

	}
}






