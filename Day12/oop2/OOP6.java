package oop2;

class Cat {
	private String name;
	private String spec;
	// ������ : ��ü�� ������ �� �ڵ����� ȣ��Ǵ� �޼���
	// - public Ŭ������(�Ű����� �ʿ��� ��ŭ) { ... }
	// - ��ȯ�� ����
	// 1) �⺻������ : �Ű������� ���� ������
	public Cat() {
		name = "�߿���";
		spec = "�ð��ں���";
	}
	// 2) ������ : �Ű������� �ִ� ������
	public Cat(String name, String spec) {
		this.name = name;
		this.spec = spec;
	}
	// 3) ��������� : ������ Ŭ������ ��ü�� ���ο� ��ü�� ����� ������
	public Cat(Cat that) {
		// ���ǻ��� - ����� ����� ������ �Ǿ������ ����....
		this.name = that.name;	// ����ô� �ٸ� ���� �̿��Ͽ� ����ȿ���� ����.
		this.spec = that.spec;	// ������ ��� ������ ����Ǵ� �ʿ��� ȿ���� ���� �� ����.
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
		Cat cat2 = new Cat("���", "�𰥰����");
		Cat cat3 = new Cat(cat2);
		System.out.println(cat3 + " " + cat2);
		System.out.println(cat1.getName() + " : " + cat1.getSpec());
		System.out.println(cat2.getName() + " : " + cat2.getSpec());
		System.out.println(cat3.getName() + " : " + cat3.getSpec());
	}
}
