package oop2;

import myclass.Box;

public class ConstructEX1 {
	public static void main(String[] args) {
		Box myBox1 = new Box("내 상자1", true);
		Box myBox2 = new Box("내 상자2", true);
		myBox1.showInfo();
		myBox2.showInfo();
	}
}