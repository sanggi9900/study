package tech1;

class unit {
	// 1) �ʵ忡�� �����ϱ� -> �迭 ��ü�� length �ʵ�
	// �����ڿ��� ���� �ʱ�ȭ(����)�� �� �� ����
	protected final String name;
	public unit() {
		name = "����";
	}
	// �� �ܿ����� �̸� ������ �� ����
	// public void setName(String name) { this.name = name; }
	public final String getName() { return name; }
}
class Knight extends unit {
	public Knight() {}
	public void action() { System.out.println(name + " : WRYYYYYY!!!!"); }
	// 2) �޼��忡 �����ϱ�
	// - �ش� �޼��带 ������ �� ������, ��������� ������� �ʴ´�.
	// public String getName() { return "���" + name; }	
}

public class FinalSample {
	public static void main(String[] args) {
		// final Ű���� : ���ϸ� ����� ���� �����ϴ� Ű����
		Knight knight1 = new Knight();
		knight1.action();
	}
}
