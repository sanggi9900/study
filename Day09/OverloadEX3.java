package method;

public class OverloadEX3 {
	// �����ε��� ���ؼ� Ư���� �������� �޼��带 ȣ���� �� �ִ�.
	// - �ϳ��� �Ŵ���(?) �޼��带 �غ��Ͽ� ���
	// - �� �޼��带 ����� ��, ȣ���ϴ� ����� �޸��ϰڴ�.
	public static void showNumber(int end) {
		// System.out.println("1�� ȣ��!");
		showNumber(1, end);
	}
	public static void showNumber(int start, int end) {
		// System.out.println("2�� ȣ��!");
		showNumber(start, end, 1);
	}
	
	public static void showNumber(int start, int end, int step) {
		// System.out.println("3�� ȣ��!");
		while (start <= end) {
			System.out.print(start + " ");
			start += step;
		} System.out.println("�������");
	}
	public static void main(String[] args) {
		showNumber(6);
		showNumber(2,7);
		showNumber(1,12,2);
	}
}
