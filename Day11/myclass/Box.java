package myclass;
// Ŭ������ �������� : ������ �� �� �ֳ�? public�� �Ϲ������� �ٴ´�.
public class Box {
	// ����� �������� : ������ �� �� �ֳ�? Ŭ������ ��������ʹ� �ٸ��� ����.
	// - Ŭ������ �������� : �ٸ� ��Ű������ �̿� ���� ����
	// - ����� �������� : ��ü�� ������ ���Ŀ� �̿밡�� ����
	private String name;	// Ư�� - ���ڸ�
	private boolean state;	// Ư�� - ������ ����
	public void open() {	// �޼��� - ���� ����
		if (!state) {
			state = true;
			System.out.println(name+"��(/��) ���ϴ�.");
		}
	}
	public void close() {	// �޼��� - ���� �ݱ�
		if (state) {
			state = false;
			System.out.println(name+"��(/��) �ݽ��ϴ�.");
		}
	}
}
