package oop1;
// Ŭ������ �⺻������ �����Ǵ� ���赵�̱� ������
// �̸��� �ߺ��� ������� �ʴ´�.
class Box2{
	String name;	// Ư�� - ���ڸ�
	boolean state;	// Ư�� - ������ ����
	void open() {	// �޼��� - ���� ����
		if (!state) {
			state = true;
			System.out.println(name+"��(/��) ���ϴ�.");
		}
	}
	void close() {	// �޼��� - ���� �ݱ�
		if (state) {
			state = false;
			System.out.println(name+"��(/��) �ݽ��ϴ�.");
		}
	}
}
public class AbstractEX2 {
	public static void main(String[] args) {
		Box2 box1 = new Box2();
		Box2 box2 = new Box2();
		box1.name = "����1";
		box1.state = false;
		box2.name = "����2";
		box2.state = true;
		System.out.println(box1.name + " : " + box1.state);
		System.out.println(box2.name + " : " + box2.state);
		box1.open();
		box2.close();
		System.out.println(box1.name + " : " + box1.state);
		System.out.println(box2.name + " : " + box2.state);
	}
}
