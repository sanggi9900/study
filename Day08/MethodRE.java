package method;

import java.util.Scanner;

public class MethodRE {
	public static int testMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		System.out.println("결과 : " + num);
		if (num > 0) 		return  1;
		else if (num == 0)  return  0;
		else 				return -1;
	}
	
	public static void main(String[] args) {
		// 복습문제 - 반환형이 존재하는 메서드입니다.
		// 임의의 정수를 입력을 받아 출력합니다.
		// 정수값의 종류에 따라 아래의 결과가 나옵니다.
		// - 1) 양수 : 1
		// - 2) 음수 : -1
		// - 3) 영(0) : 0
		
		// 10을 입력하면 "첫번째 : 1" 이라고 출력됩니다.
		System.out.println("첫번째 : " + testMethod() );
		// -101을 입력하면 "두번째 : -1" 이라고 출력됩니다.
		System.out.println("두번째 : " + testMethod() );
		// 0을 입력하면 "세번째 : 0" 이라고 출력됩니다.
		System.out.println("세번째 : " + testMethod() );
	}
}
