package method;

import java.util.Scanner;

public class MethodEX1 {
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 >> ");
		int num2 = sc.nextInt();
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		String result;
		// 문자열에 덧셈으로 합치기
		if (num2 == 0) result = "연산불가";
		else 		   result = "" + (num1 / num2);
		System.out.print("몫 : " + result);
	}
	public static void main(String[] args) {
		calculator();
	}
}





