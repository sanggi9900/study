package oop3;

import myclass.Box;
import myclass.Human;

public class InteractionEX1 {
	public static void main(String[] args) {
		Human PC1 = new Human("�ڽ�������");
		Box thatBox = new Box("�� ����");
		PC1.showInfo();
		thatBox.showInfo();
		PC1.actionTo(thatBox);
		thatBox.showInfo();
		PC1.actionTo(thatBox);
		thatBox.showInfo();
	}
}
