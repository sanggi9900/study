package myclass;

public class IntBox extends Box {
	// �ʵ忡�� ���� �̸� �־�� �� ����
	// - ���� ���Ǵ� ���� �ִ´�.
	private int data = 0;
	// ������ �غ�� ���ǻ��� : �θ�Ŭ������ �⺻������
	// - �⺻ �����ڴ� �Ϲ���(�ڵ�)���� ȣ��ȴ�.
	// - �� �� �����ڴ� �����(����)���� ȣ���ؾ� ��.
	// - �θ��� �⺻�����ڰ� ������ ������ �θ��� �ٸ� �����ڸ�
	//   ȣ���ؾ� �Ѵٴ� ������ �����.
	public IntBox() {
		super("��������0");
	}
	public IntBox(String name) {
		super(name);
	}
	public IntBox(String name, int data) {
		super(name);
		this.data = data;
	}
	
	public void setData(int data) {
		if (state) {
			this.data = data;
			System.out.println(name + " - ���强��...");
		}
		else {
			System.out.println(name + " - �������...");
		}
	}
	public int getData() {
		if (state) {
			return data;
		}
		else {
			return -1;
		}
	}
	
	// ������ : ������ �ȵ�� ���� ����
	public void showInfo() {
		if (state) {
			System.out.println(name + " : " + data);
		}
		else {
			System.out.println(name+"��(/��) ���� �ֽ��ϴ�.");
		}
	}

}












