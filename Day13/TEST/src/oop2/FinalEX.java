package oop2;

class Human {
	// �ʵ� : ��ü���� ������ �� �ִ� Ư��
	private String name;
	private int age;
	private double height;
	private double weight;
	// �޼��� : ����
	public Human() {
		this("���", 0, 0, 0);
		/*
		name = "���";
		age = 0;
		height = 0;
		weight = 0;
		*/
	}
	public Human(String name) {
		this(name, 0, 0 ,0);
		/*
		this.name = name;
		age = 0;
		height = 0;
		weight = 0;
		*/
	}
	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	public double getHeight() { return height; }
	public double getWeight() { return weight; }
	
	public void introduce() {
		System.out.println("�� "+name+"�̾�!");
	}
	public void showInfo() {
		System.out.println(
				name +
				"( " + age + " "
				     + height + " "
				     + weight + " )");
	}
}

public class FinalEX {
	public static void main(String[] args) {
		Human person1 = new Human();
		Human person2 = new Human("ȫ�浿");
		Human person3 = new Human("Tom",25,177.8,68.5);
		person1.introduce();
		person1.showInfo();
		person2.showInfo();
		person3.showInfo();
	}
}