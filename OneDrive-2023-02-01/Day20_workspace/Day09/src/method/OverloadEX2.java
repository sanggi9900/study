package method;

public class OverloadEX2 {
	// 오버로딩시 주의할 점 : 반환형은 되도록 일치시켜줘야 한다.
	// - 최소한으로 숫자/문자/논리 정도의 카테고리는 맞춰줘야 함
	public static int getSum(int num) {
		int result = 0;
		if (num < 0) {
			for (int i = -1; i>=num;i-=1) {
				result += i;
			}
		}
		else {
			for (int i = 1; i<=num;i+=1) {
				result += i;
			}
		}
		return result;
	}
	public static int getSum(double fnum) {
		// System.out.println("연산불가");
		return 0;
	}
	public static int getSum(String word) {
		// System.out.println("연산불가");
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("합 : " + getSum(-5));
		System.out.println("합 : " + getSum(15));
		System.out.println("합 : " + getSum(3.14));
		System.out.println("합 : " + getSum("8"));
	}
}
