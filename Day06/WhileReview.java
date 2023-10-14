package controlflow;

import java.util.Scanner;

public class WhileReview {
	public static void main(String[] args) {
		// 무한반복 - 입력이 없으면 성립하지 않는다.
		// - 조건문처럼 들어감.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num == 0) {
			System.out.print("정수 하나 입력 >> ");
			num = sc.nextInt();
		}
		sc.close();
		// 유한반복 - 특정횟수/정수들을 준비하는 것이 목적
		// - 규칙성을 파악을 잘 해야 한다(원본 -> 분해 -> 통일 -> 포장)
		if (num > 0) {
			while (num >= 1) {
				System.out.print(num + " ");
				num -= 1;
			} System.out.print("\n");
		}
		else {
			while (num <= -1) {
				System.out.print(num + " ");
				num += 1;
			} System.out.print("\n");
		}
	}
}





