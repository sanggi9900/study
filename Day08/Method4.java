package method;

import java.util.Scanner;
// 참고 : 글꼴이 마음에 안들면
//      Windows -> Preference 를 누르면 설정창이 나오고
//      General -> Appearance -> Colors and Fonts로 들어가서
//      목록에서 Java -> Java Text Editor Font에서 Edit를 눌러 변경 가능

public class Method4 {
	// 메서드를 만들 때 기억할 점 : 코드의 중복을 처리하기 위한 것
	// - 1회성 코드를 위해서 만들지 않는다.
	// - 다회성 코드이며, 범용성을 가져야 한다.
	// - 메서드는 불규칙적인 반복을 위하여 준비되는 문법이다.
	public static int makeSum(int start, int end) {
		int result = 0;
		for (int i = start;i<=end;i+=1) {
			result += i;
		}
		return result;
	}
	public static void program1(Scanner sc) {
		System.out.print("정수 하나 입력 >> ");
		int num = sc.nextInt();
		int result = makeSum(1, num);
		System.out.println(num+"까지의 합 : " + result);
	}
	public static void program2(Scanner sc) {
		System.out.print("정수 하나 입력 >> ");
		int num = sc.nextInt();
		int result = makeSum(num, -1);
		System.out.println(num+"까지의 합 : " + result);
	}
	public static void main(String[] args) {
		// 반환과 매개변수가 둘 다 있음 - 직접 입력/출력은 없음
		// -> 단순 연산은 만들지 않는다.
		// -> 반복, 조건문 등이 많이 포함된 연산이 메서드가 된다.
		Scanner sc = new Scanner(System.in);
		program1(sc);
		program2(sc);
		sc.close();
	}
}
