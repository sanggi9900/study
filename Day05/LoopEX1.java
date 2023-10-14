package controlflow;

import java.util.Scanner;

public class LoopEX1 {
	// 팁 : 자동완성으로 인해 조작이 안될 경우 ESC키를 누르세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num%2==0) {
			System.out.print("홀수 입력 >> ");
			num = sc.nextInt();
		}
		System.out.println("준비되는 값 : " + num);
		
		// 아래와 같은 방식도 존재함
		// - 보조제어문 break를 활용하는 방식
		// - 사용할려면 조건문이 반드시 필요하니 주의할 것
		while (true) {
			System.out.print("홀수 입력 >> ");
			num = sc.nextInt();
			if (num%2!=0) {
				break; // 반복을 중간에 종료시키는 제어문
			}
		}
		System.out.println("준비되는 값 : " + num);
		
		sc.close();
	}
}







