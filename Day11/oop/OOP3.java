package oop;
// �ٸ� ��Ű���� Ŭ���� ���� �ҷ��´�.
import myclass.Box;

public class OOP3 {
	public static void main(String[] args) {
		// �������� : Ư��(�ʵ�)�� ��ȣ�ϱ� ���� ���
		// - ������ ����� ���ؼ��� �ʵ带 �̿��ϱ� ���� ���
		// - ������ ��� : �޼���
		// ĸ��ȭ�� �ñظ�ǥ : ���� ����
		Box box1 = new Box();
		// �߻��ϴ� ���� : �ν��Ͻ�(������ ���� ���� ��ü)�� �ٲ� �� ����
		box1.open();
		box1.close();
	}
}
