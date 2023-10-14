package controlflow;

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		// 조건문 : 코드를  상황에 맞춰서 실행하기 위한 제어문
		// - 상황 판단을 위해 조건식(관계연산자 및 논리연산자)가 사용된다.
		
		// 기본사용1 : if만 사용하기 - 추가실행
		System.out.print("짝수/홀수여부 판단 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		// - 주의사항 : 놓치는 경우의 수가 없도록 만들어준다.
		System.out.println("결과 : " + num);
		if (num % 2 == 0) {
			System.out.println("짝수입니다~");
		}
		if (num % 2 != 0) {
			System.out.println("홀수입니다~");
		}
	}
}
