package oop2;

import myclass.Box;

public class EncapsEX2 {
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.setName("내상자");
		myBox.setStatus(false);
		System.out.println(myBox.getName());
		System.out.println(myBox.getStatus());
		// showInfo는 어디까지나 테스트용도이니 주의.
		// 실제개념에는 맞지 않음!
		myBox.showInfo();
	}
}
