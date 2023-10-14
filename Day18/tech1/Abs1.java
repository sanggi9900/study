package tech1;

abstract class Box {
	protected String name;
	protected boolean state;
	// �����ڴ� �غ��� �� �ְ�, ���� �� �ִ�.
	// �غ��ϸ�, ������ ȣ���ؾ� �ϰ�
	// �غ���ϸ�, �⺻�����ڰ� �ڵ����� �غ�Ǵ� ȣ������ �ʾƵ� ��
	public Box(String name) { this.name = name; }
	public void open() { state = true; }
	public void close() { state = false; }
	// �߻�޼��� - ������ �������� �ʴ� �޼��� -> �������̵��� ������ �ؾ� ��
	public abstract void check();
}
// �Ϲ� Ŭ������ �߻� Ŭ���� ������ �����ؼ� ����� �� ������ ����
class BoxA extends Box {
	private int data;
	public BoxA(int data) {
		super("��������");
		this.data = data;
	}
	public void check() {
		System.out.println(name + " : " + data);
	}
}
class BoxB extends Box {
	private double data;
	public BoxB(double data) {
		super("��������");
		this.data = data;
	}
	public void check() {
		System.out.println(name + " : " + data);
	}
}

public class Abs1 {
	public static void main(String[] args) {
		BoxA box1 = new BoxA(100);
		BoxB box2 = new BoxB(3.14);
		box1.check();
		box2.check();
		// 1. �θ�Ŭ������ ��ü ������ �ȵȴ� - Ŭ���� ��밣�� �Ǽ��� ���� �� ����.
		// -> �θ�Ŭ������ ������ û����(Blue Print)�뵵�θ� ���ȴ�.
		// 2. �׷��鼭 ��ĳ���� / �ٿ�ĳ������ �����ϵ��� ����� ���� ��.
		// -> ���������� �غ�� �����ϴ�.
		Box box3 = box1;
		Box box4 = box2;
		box3.check();
		box4.check();
		// ���ǻ��� : �ڽĿ��� Ư�� �ʵ��� ����� �����ϰ� �غ��� �� ����
		//         -> �Ű������� �غ��ϴ� ����, �ش� �Ű������� �ݵ�� �־�� ��
		//         ��, ��ȯ���� �Ϻη� ������ �� ����
	}
}