package myclass;
// Ŭ������ �������� : ������ �� �� �ֳ�? public�� �Ϲ������� �ٴ´�.
public class Box {
	// ����� �������� : ������ �� �� �ֳ�? Ŭ������ ��������ʹ� �ٸ��� ����.
	// - Ŭ������ �������� : �ٸ� ��Ű������ �̿� ���� ����
	// - ����� �������� : ��ü�� ������ ���Ŀ� �̿밡�� ����
	private String name;	// Ư�� - ���ڸ�
	private boolean state;	// Ư�� - ������ ����
	// ������ - �����ε����� �غ��
	public Box() {
		// this�� �뵵2 : ������ ȣ���
		this("���� - BŸ��", false);
		// ���ǻ��� : ������ �ֿ켱���� ȣ��Ǿ�� ��
	}
	public Box(String name) {
		this(name, false);
	}
	public Box(boolean state) {
		this("���� - AŸ��", state);
	}
	public Box(String name, boolean state) {
		this.name = name;
		this.state = state;
	}
	// getter�� setter�� �����ϰ� ���ʿ� ���Ƽ� �з��ϴ°� ����
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(boolean status) {
		this.state = status;
	}
	public String getName() {
		return name;
	}
	public boolean getStatus() {
		return state;
	}
	// ��� �޼���
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
	public void showInfo() {
		System.out.println(name + " : " + state);
	}
}
