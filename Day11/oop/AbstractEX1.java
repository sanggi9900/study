package oop;

class Box1{
	String name;	// 특성 - 상자명
	boolean state;	// 특성 - 상자의 상태
	void open() {	// 메서드 - 상자 열기
		if (!state) state = true;
	}
	void close() {	// 메서드 - 상자 닫기
		if (state) state = false;
	}
}

public class AbstractEX1 {
	public static void main(String[] args) {
		
	}
}
