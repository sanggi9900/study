package oop4;

import myclass.IntBox;

public class InheritEX {
	public static void main(String[] args) {
		// 상속의 주 목적1 : 코드를 처음부터 새로 만들 수 없다. 너무 오래걸림.
		// 상속의 주 목적2 : 나중에 이것들이 서로 다 다른 것이라서 통일이 안되니, 통일할 수 있게 만든다.
		IntBox iBox1 = new IntBox();
		IntBox iBox2 = new IntBox("정수상자2");
		IntBox iBox3 = new IntBox("정수상자3", 200);
		iBox1.showInfo();
		iBox2.showInfo();
		iBox3.showInfo();
		iBox2.setData(100);
		System.out.println("정수상자2의 값 : " + iBox2.getData());
		iBox2.open();
		iBox2.showInfo();
		iBox2.setData(100);
		iBox2.showInfo();
		System.out.println("정수상자2의 값 : " + iBox2.getData());
		iBox2.close();
		iBox2.showInfo();
		System.out.println("정수상자2의 값 : " + iBox2.getData());
	}
}
