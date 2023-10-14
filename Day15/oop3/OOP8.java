package oop3;

class NameTag {
	private String name;
	private String number;
	public NameTag(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public String getNum() {
		return number;
	}
}

public class OOP8 {
	public static void swap(NameTag[] t1, NameTag[] t2) {
		NameTag tmp = t1[0];
		t1[0] = t2[0];
		t2[0] = tmp;
	}
	public static void main(String[] args) {
		/*
		NameTag tag1 = new NameTag("ȫ�Ϻ�", "11-1234");
		NameTag tag2 = new NameTag("����", "10-1234");
		// �� �۾��� �ٸ� �޼��忡�� �����ؼ� ���� ����� �������� �� �� ����
		NameTag tmp;
		tmp = tag1;
		tag1 = tag2;
		tag2 = tmp;
		System.out.println(tag1.getNum());
		System.out.println(tag2.getNum());
		*/
		NameTag[] tag1 = new NameTag[1];
		NameTag[] tag2 = new NameTag[1];
		tag1[0] = new NameTag("ȫ�Ϻ�", "11-1234");
		tag2[0] = new NameTag("����", "10-1234");
		swap(tag1, tag2);
		System.out.println(tag1[0].getNum());
		System.out.println(tag2[0].getNum());
	}
}




















