package oop2;

import myclass.Box;

public class EncapsEX2 {
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.setName("������");
		myBox.setStatus(false);
		System.out.println(myBox.getName());
		System.out.println(myBox.getStatus());
		// showInfo�� �������� �׽�Ʈ�뵵�̴� ����.
		// �������信�� ���� ����!
		myBox.showInfo();
	}
}
