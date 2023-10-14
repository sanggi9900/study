package oop3;

import myclass.Box;
import myclass.Human;

public class InteractionEX1 {
	public static void main(String[] args) {
		Human PC1 = new Human("박스관리자");
		Box thatBox = new Box("그 상자");
		PC1.showInfo();
		thatBox.showInfo();
		PC1.actionTo(thatBox);
		thatBox.showInfo();
		PC1.actionTo(thatBox);
		thatBox.showInfo();
	}
}
