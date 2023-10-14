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
			System.out.println("출력할 수 없습니다.");
		}
		else {
			while (start <= end) {
				System.out.print(start + " ");
				start += step;
			} System.out.println("출력종료");
		}
	}
	public static void main(String[] args) {
		showNumber(0);
		showNumber(10,9);
		showNumber(10,9,2);
		showNumber(10,20,-2);
	}
}
