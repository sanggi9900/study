package controlflow;

import java.util.Scanner;

public class IfEX1 {
	public static void main(String[] args) {
		System.out.print("정수값 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("입력된 값 : " + num);
		// 같은 내용을 빼야 코드가 알아보기 쉬워짐
		if (num < 0) {
			System.out.println("음수입니다.");
		}
	}
}
