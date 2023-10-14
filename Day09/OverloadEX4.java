package method;

public class OverloadEX4 {
	public static void showNumber(int end) {
		showNumber(1, end, 1);
	}
	public static void showNumber(int start, int end) {
		showNumber(start, end, 1);
	}
	public static void showNumber(int start, int end, int step) {
		if (start > end || step <= 0) {
			System.out.println("����� �� �����ϴ�.");
		}
		else {
			while (start <= end) {
				System.out.print(start + " ");
				start += step;
			} System.out.println("�������");
		}
	}
	public static void main(String[] args) {
		showNumber(0);
		showNumber(10,9);
		showNumber(10,9,2);
		showNumber(10,20,-2);
	}
}
