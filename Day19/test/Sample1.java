package test;

public class Sample1 {
	private int data;
	private static int count;
	public Sample1(int data) {
		this.data = data;
		count += 1;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public String toString() {
		return ""+data;
	}
	public static void check() {
		System.out.println("생성수량 : " + count);
	}
}
