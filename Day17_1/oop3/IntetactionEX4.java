package oop3;

import myclass.Human;

public class IntetactionEX4 {
	public static void main(String[] args) {
		Human PC1 = new Human("�ڽ�������1");
		Human PC2 = new Human("�ڽ�������2");
		PC1.showInfo();
		PC2.showInfo();
		PC1.actionTo(PC2);
		PC1.showInfo();
		PC2.showInfo();
		PC1.actionTo(PC2);
		PC1.showInfo();
		PC2.showInfo();
	}
}
