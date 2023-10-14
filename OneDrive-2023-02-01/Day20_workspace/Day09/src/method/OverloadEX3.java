package method;

public class OverloadEX3 {
	// 오버로딩을 통해서 특이한 구성으로 메서드를 호출할 수 있다.
	// - 하나의 거대한(?) 메서드를 준비하여 사용
	// - 이 메서드를 사용할 때, 호출하는 방식을 달리하겠다.
	public static void showNumber(int end) {
		// System.out.println("1번 호출!");
		showNumber(1, end);
	}
	public static void showNumber(int start, int end) {
		// System.out.println("2번 호출!");
		showNumber(start, end, 1);
	}
	
	public static void showNumber(int start, int end, int step) {
		// System.out.println("3번 호출!");
		while (start <= end) {
			System.out.print(start + " ");
			start += step;
		} System.out.println("출력종료");
	}
	public static void main(String[] args) {
		showNumber(6);
		showNumber(2,7);
		showNumber(1,12,2);
	}
}
