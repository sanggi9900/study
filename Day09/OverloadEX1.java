package method;

public class OverloadEX1 {
	// 메서드 오버로딩은 매개변수의 자료형 및 수량에 의해서 구별된다.
	// - 이 2가지가 모두 동일하면 중복으로 취급되니 주의
	public static int function(int n1, int n2) {
		return n1 + n2;
	}
	public static String function(String word1, String word2) {
		return word1 + word2;
	}
	
	// 오버로딩에는 부적절한 메서드 : 일반적으로 통용되는 개념과 맞지 않음
	public static int function(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
	public static void main(String[] args) {
		System.out.println("두 정수의 합 : "	+ function(10,20)	);
		System.out.println("두 문자열의 합 : "	+ function("A","B")	);
		System.out.println("세 정수의 곱 : " 	+ function(3,4,5)	);
	}
}
