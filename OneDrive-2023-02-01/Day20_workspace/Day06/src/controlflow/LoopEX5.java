package controlflow;

import java.util.Scanner;

public class LoopEX5 {
	public static void main(String[] args) {
		// 가장 많이 사용되는 형태 - 무한반복입력 + 유한반복연산
		// - 필요한 것만 걸러 반복으로 컴퓨터로 대신 연산을 진행
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num <= 0) {
			System.out.print("양수 입력 >> ");
			num = sc.nextInt();
		} sc.close();
		System.out.println("올바른 값입니다.");
		int result1 = 0;
	
		for (int value = num; value > 0;value -=1) {
			result1 += value;
		}
		int result2 = 0;
		while (num > 0) {
			result2 += num;
			num -= 1;
		}
		
		System.out.println("while을 이용한 합 : " + result1);
		System.out.println("for를 이용한 합 : " + result2);
	}
}
