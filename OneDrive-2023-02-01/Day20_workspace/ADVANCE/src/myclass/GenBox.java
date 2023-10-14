package myclass;

public class GenBox<T> extends Box {
	private T data;
	public GenBox() {
		super("����");
	}
	public GenBox(String name) {
		super(name);
	}
	public GenBox(String name, T data) {
		super(name);
		this.data = data;
	}

	public void setData(T data) {
		if (state) {
			this.data = data;
			System.out.println(name + " - ���强��...");
		}
		else {
			System.out.println(name + " - �������...");
		}
	}
	public T getData() {
		if (state) {
			return data;
		}
		else {
			return null; // ����� �ڷ����� �����߸���
		}
	}

	public void showInfo() {
		if (state) {
			System.out.println(name + " : " + data);
		}
		else {
			System.out.println(name+"��(/��) ���� �ֽ��ϴ�.");
		}
	}
}
