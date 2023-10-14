package oop2;

import myclass.Box;

public class ConstructEX2 {
	public static void main(String[] args) {
		Box myBox1 = new Box("내 상자1",  true);
		Box myBox2 = new Box("내 상자2");
		Box myBox3 = new Box(false);
		Box myBox4 = new Box();
		myBox1.showInfo();
		myBox2.showInfo();
		myBox3.showInfo();
		myBox4.showInfo();
	}
}
