package oop2;

class Dog {
	private String name;
	private String species;
	// setter : �ʵ忡 ���� �����ϴ� �޼���
	// - �Ϲ������� set+�ʵ������ �����.
	public void setName(String newName) {
		name = newName;
	}
	public void setSpecies(String species) {
		// this : �ڱ��ڽ�(��ü)�� �ǹ��ϴ� �����
		// - �⺻�뵵 : ������ �ߺ�����
		this.species = species;
	}
	// getter : �ʵ忡 ����� ���� �������� �޼���
	// - �Ϲ������� get+�ʵ������ �����.
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	// �� : setter�� getter�� ���Ǵ�.
	// - setter�� ���� �� �ִ� �͵鿡 �������ش�.
	// - getter�� �ݵ�� �о �˾ƾ� �ϴ� �͵鿡 �������ش�.
	public void bark() {
		System.out.println("�ппп�!!!");
	}
}

public class OOP5 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("�߹���");			// dog1.name = "�߹���";
		dog1.setSpecies("�ð��ں���");	// dog1.species = "�ð��ں���";
		dog1.bark();
		System.out.println(dog1.getName() + "�� ���� " + dog1.getSpecies() +"�Դϴ�.");
		dog1.bark();
	}
}
