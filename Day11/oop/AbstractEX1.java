package oop;

class Box1{
	String name;	// Ư�� - ���ڸ�
	boolean state;	// Ư�� - ������ ����
	void open() {	// �޼��� - ���� ����
		if (!state) state = true;
	}
	void close() {	// �޼��� - ���� �ݱ�
		if (state) state = false;
	}
}

public class AbstractEX1 {
	public static void main(String[] args) {
		
	}
}
