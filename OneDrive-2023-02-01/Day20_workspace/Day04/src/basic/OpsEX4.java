package basic;

import java.util.Scanner;

public class OpsEX4 {
	public static void main(String[] args) {
		// 1. 코드 자동완성 단축키 : ctrl + space
		// 2. 패키지 자동완성 단축키 : ctrl + shift + o
		System.out.print("첫번째 정수 >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >> ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(num1 +"은 " + num2 +"의 배수인가? " + (num1 % num2 == 0));
		System.out.printf("%d은 %d의 배수인가? %b\n", num1, num2, num1%num2==0);
		System.out.printf(num1 + "은 %d의 배수인가? " + (num1%num2==0), num2);
	}
}
