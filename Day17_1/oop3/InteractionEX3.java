package oop3;

import myclass.Human;

public class InteractionEX3 {
	public static void main(String[] args) {
		Human PC1 = new Human("박스관리자1");
		Human PC2 = new Human("박스관리자2");
		PC1.showInfo();
		PC2.showInfo();
		// 상대방이 상호작용할 수 있는 상태인지도 체크할 수 있음
		// - ex) 상자를 받을 수 있는 상대방인지 여부 등....
		PC1.greetingTo(PC2);
		PC1.introduce();
		PC2.greetingTo(PC1);
		PC2.introduce();
	}
}
