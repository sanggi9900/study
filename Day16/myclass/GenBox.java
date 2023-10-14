package myclass;

public class GenBox<T> extends Box {
	private T data;
	public GenBox() {
		super("상자");
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
			System.out.println(name + " - 저장성공...");
		}
		else {
			System.out.println(name + " - 저장실패...");
		}
	}
	public T getData() {
		if (state) {
			return data;
		}
		else {
			return null; // 비원시 자료형의 공통중립값
		}
	}

	public void showInfo() {
		if (state) {
			System.out.println(name + " : " + data);
		}
		else {
			System.out.println(name+"이(/가) 닫혀 있습니다.");
		}
	}
}
