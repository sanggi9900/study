package controlflow;

import java.util.Scanner;

public class IfEX3 {
	public static void main(String[] args) {
		System.out.print("메뉴 >> ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();
		
		String result;
		// 문자열이라면 ch.compareTo("A") == 0
		if (ch == 'A') result = "HELLO";
		else if (ch == 'B') result = "GOOD BYE";
		else result = "잘못된 입력";
		
		System.out.println(result + "\n프로그램 종료");
	}
}
