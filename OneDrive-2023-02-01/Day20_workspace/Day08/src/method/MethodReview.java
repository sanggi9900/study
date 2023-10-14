package method;

import java.util.Scanner;

public class MethodReview {
	// 기본형식 - 별개의 프로그램(절차)
	public static void program() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수값 2개 입력 >> ");
		double avg = sc.nextDouble() + sc.nextDouble();
		avg /= 2;
		System.out.println("결과 : " + avg);
		System.out.println("정수부 : " + (int)avg);
		System.out.println("실수부 : " + avg % 1);
	}
	// 반환형이 존재함 - 제일 가치가 있는 것을 값으로 출력한다.
	public static double getAvg() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수값 2개 입력 >> ");
		double avg = sc.nextDouble() + sc.nextDouble();
		return avg / 2;
	}
	public static void main(String[] args) {
		// 메서드 : 다른 언어에서 함수에 대응되는 개념
		// 함수 - 단순한 기능
		// 메서드 - 연결되어 있는 동작
		
		// 메서드의 형식은 반환의 유무 / 매개변수의 유무에 따라 달라짐
		program();
		System.out.println("평균1 : " + getAvg());
		System.out.println("평균2 : " + getAvg());
	}
}
