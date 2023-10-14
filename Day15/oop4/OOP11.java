package oop4;
//�θ�Ŭ����(Super Class) - ���� ����
class Animal {
	// �ʵ�� protected / �޼���� public�� �̿�
	protected String name;
	public Animal(String name) { this.name = name; }
	public void move() {
		System.out.println(name+"�� �̵��մϴ�.");
	}
}
// �ڽ�Ŭ����(Sub Class) - ��üȭ�� ����
class Dog extends Animal {
	private String barkSound;
	public Dog(String name, String sound) {
		// super : �θ��� ���� ����ϱ� ���� �����
		// this : �ڽ��� ���� ����ϱ� ���� �����
		// �θ� �����ڴ� ���� �ֻ�ܿ��� ���� ȣ��Ǿ�� ��
		super(name); 
		barkSound = sound;
	}
	// �θ��� ���� ��ӹ޾Ҵٸ� �ڽ��� �̸� �״�� �̿��� �� ����
	public void bark() {
		System.out.println(name + " : " + barkSound);
	}
}
// �ڽ�Ŭ������ �ʿ��ϸ� ������ �� �� �ִ�.
class Bird extends Animal {
	// �ʵ���� ���� �̸��� ������. �������� ����...
	private String name;
	public Bird(String name1, String name2) {
		super(name1);
		// ���� �̸��̸� �ش� Ŭ������ �ʵ尡 �켱������ ������.
		name = name2;
	}
	public void show() {
		// ���� �̸��� �� ������ super / this�� �̿��Ѵ�.
		System.out.println(this.name + " - " + super.name);
	}
	// �޼��� �������̵� : �޼����/��ȯ/�Ű������� ������ �����ϰ� ���缭 �غ�
	// - �ش� �޼��带 �������ϴ� ��
	public void move() {
		System.out.println(name + " : �޷��޷� ~ !");
		// �������̵��� �Ѵٰ� �ص� super�� ȣ�� ����
		super.move();
	}
}

public class OOP11 {
	public static void main(String[] args) {
		// ��ü������ ��Ӽ�
		// - ��ü�� ����� ���� Ŭ������ ��Ȱ���� �� �ִ�.
		// - ������ ������ Ŭ������ Ȯ���� �� �ִ�.
		Animal ani1 = new Animal("ȯ���� ����");
		Dog dog1 = new Dog("ġ�Ϳ�", "�ппп�");
		Bird bird1 = new Bird("�۰��","����");
		ani1.move();
		dog1.bark();	// �ڽ�Ŭ������ ���ο� �޼���
		dog1.move();	// �θ�Ŭ������ ���� �޼���
		bird1.show();
		bird1.move();

	}
}






