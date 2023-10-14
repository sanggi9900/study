package basic;

public class Operator4 {
	public static void main(String[] args) {
		// 비트연산자 : 특수목적 연산자
		// - 원시자료형 중, 정수계열 자료형을 응용하기 위한 연산자
		// - 이를 0과 1의 변수의 집합으로 바꿔서 이용하는 연산자
		// - int는 0과 1을 보관할 수 있는 32개짜리 배열로 해석해야 한다.
		/*signed*/ int num1 = 128;
		int num2 = 192; // 128 + 64
		System.out.println("결과 : " + (num1 << 1));	// 비트 이동연산자
		System.out.println("결과 : " + (num1 >> 1));	// 이동 칸수를 지정함
		System.out.println("결과 : " + (num1 & num2)); // 비트 논리곱
		System.out.println("결과 : " + (num1 | num2)); // 비트 논리합
		System.out.println("결과 : " + (~num1)); 		// 비트 논리부정
		System.out.println("결과 : " + (num1^num2));	// 비트 배타논리합(XOR)
		// <<< / >>> : 무부호 비트논리연산자
		// unsigned : 부호를 취급하지 않는 것 -> -21 ~ 21 -> 0 ~ 42억 
		// System.out.println("결과 : " + (num1 <<< 1));
		// System.out.println("결과 : " + (num1 >>> 1));
		
		// 주 목적 : 하드웨어 제어용
	}
}
