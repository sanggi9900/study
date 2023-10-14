package method;

public class Method5 {
	public static int me1(int n1, int n2) {
		return n1 + n2;
	}
	public static double me2(int n1, double n2) {
		return n1 + n2;
	}
	public static double me3(double n1, int n2) {
		return n1 + n2;
	}
	public static double me4(double n1, double n2) {
		return n1 + n2;
	}
	
	public static int test(int n1, int n2) {
		return n1 + n2;
	}
	public static double test(int n1, double n2) {
		return n1 + n2;
	}
	public static double test(double n1, int n2) {
		return n1 + n2;
	}
	public static double test(double n1, double n2) {
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		// 만들어야 하는 것은 똑같음

		// 함수 : 서로 다른 값을 다룬다면 서로 다른 기능이 준비되어야 한다.
		// - 서로 다른 함수로써 이름이 구별되어 준비가 되어야 함
		System.out.println("결과1 : " + me1(10,20));
		System.out.println("결과2 : " + me2(10,20.5));
		System.out.println("결과3 : " + me3(10.2,20));
		System.out.println("결과4 : " + me4(10.2,20.5));

		// 메서드 : 서로 다른 값의 같은 동작이니, 이를 묶어서 쓸 수 있다.
		// - 메서드 오버로딩이라 부른다.
		// - 매개변수에 의해서 메서드들이 구분된다.
		// - 메서드명은 완전히 다른 동작을 수행할 때 달리 부여
		//   결과적으로 같은 동작은 매개변수만 달리 준비한
		//   동일한 메서드명으로 통합한다.
		System.out.println("결과1 : " + test(10,20));
		System.out.println("결과2 : " + test(10,20.5));
		System.out.println("결과3 : " + test(10.2,20));
		System.out.println("결과4 : " + test(10.2,20.5));
	}
}
