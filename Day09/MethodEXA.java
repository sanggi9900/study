package method;

public class MethodEXA {
	public static int getSum(int n1, int n2) {
		if (n1 == n2) return 0;
		else {
			int result = 0; int a = 0; int b = 0;
			if (n1 < n2) {
				a = n1; b = n2;
			}
			else {
				a = n2; b = n1;
			}
			while (a <= b) {
				result += a; a += 1;
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// 메서드 복습문제
		// 임의로 지정한 구간의 정수들의 합을 구하는 메서드를 정의하세요.
		// 매개변수와 반환형 모두 존재합니다.
		int result1 = getSum( 1, 5);
		int result2 = getSum( 6,10);
		int result3 = getSum(10, 6);
		int result4 = getSum(-1,-5);
		int result5 = getSum( 5, 5);
		System.out.println("결과1 : " + result1); // 15
		System.out.println("결과2 : " + result2); // 40
		System.out.println("결과3 : " + result3); // 40
		System.out.println("결과4 : " + result4); // -15
		System.out.println("결과5 : " + result5); // 0
	}
}
