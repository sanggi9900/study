package oop3;

class Bird{
	private String name;
	public Bird() { this("��"); }
	public Bird(String name) { this.name = name; }
	public String getName() { return name; }
}

public class OOP7 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// �����迭�� ���ǻ��� : �������(null)
		Bird[] oarr = new Bird[3];
		// �����迭�� �迭�� ������ִ� ����
		// - �� ��ü�� �� �ε����� ���������� ��
		oarr[0] = new Bird();
		oarr[1] = new Bird("�۰��");
		oarr[2] = new Bird("��������");
		for (int i = 0; i<oarr.length; i += 1) {
			System.out.println(oarr[i].getName());
		}
	}
}












