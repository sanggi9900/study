package controlflow;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		// 무한반복 - 우리가 이용할 때는 입력을 받아야만 성립한다.
		// - 기본접근방식 : 조건문
		Scanner sc = new Scanner(System.in);
		int score = -1;
		// 조건문의 한계 : 1회 실행
		// - 반복문은 1회실행으로 끝나지 않도록 하는 것
		while (score < 0 || score > 100) {
			System.out.print("점수 입력 >> ");
			score = sc.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("잘못된 입력입니다.");
			}
		}
		sc.close();
		System.out.println("올바른 점수 : " + score);
	}
}
