package oop3;

import myclass.Human;

public class InteractionEX3 {
	public static void main(String[] args) {
		Human PC1 = new Human("�ڽ�������1");
		Human PC2 = new Human("�ڽ�������2");
		PC1.showInfo();
		PC2.showInfo();
		// ������ ��ȣ�ۿ��� �� �ִ� ���������� üũ�� �� ����
		// - ex) ���ڸ� ���� �� �ִ� �������� ���� ��....
		PC1.greetingTo(PC2);
		PC1.introduce();
		PC2.greetingTo(PC1);
		PC2.introduce();
	}
}
