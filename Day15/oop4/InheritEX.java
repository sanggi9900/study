package oop4;

import myclass.IntBox;

public class InheritEX {
	public static void main(String[] args) {
		// ����� �� ����1 : �ڵ带 ó������ ���� ���� �� ����. �ʹ� �����ɸ�.
		// ����� �� ����2 : ���߿� �̰͵��� ���� �� �ٸ� ���̶� ������ �ȵǴ�, ������ �� �ְ� �����.
		IntBox iBox1 = new IntBox();
		IntBox iBox2 = new IntBox("��������2");
		IntBox iBox3 = new IntBox("��������3", 200);
		iBox1.showInfo();
		iBox2.showInfo();
		iBox3.showInfo();
		iBox2.setData(100);
		System.out.println("��������2�� �� : " + iBox2.getData());
		iBox2.open();
		iBox2.showInfo();
		iBox2.setData(100);
		iBox2.showInfo();
		System.out.println("��������2�� �� : " + iBox2.getData());
		iBox2.close();
		iBox2.showInfo();
		System.out.println("��������2�� �� : " + iBox2.getData());
	}
}
