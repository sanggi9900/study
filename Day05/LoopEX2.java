package controlflow;

import java.util.Scanner;

public class LoopEX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0; // 진짜로 이걸 넣으면
		int num2 = 0; // 굴러갈까요?
		while (true) {
			System.out.print("정수 2개 입력 >> ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 < num2) {
				System.out.println("첫번째가 작습니다.");
			}
			else {
				// 조건문을 재활용하는 형태로 쓰면 효율적이다.
				break;
			}
		}
		System.out.printf("%d - %d = %d\n"
				, num1, num2, num1 - num2);
	}
}
