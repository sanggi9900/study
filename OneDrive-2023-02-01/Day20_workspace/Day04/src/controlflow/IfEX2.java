package controlflow;

import java.util.Scanner;

public class IfEX2 {
	public static void main(String[] args) {
		System.out.print("실수값 2개 >> ");
		Scanner sc = new Scanner(System.in);
		double fnum1 = sc.nextDouble();
		double fnum2 = sc.nextDouble();
		int select = 0;
		double result1 = 0;
		double result2 = 0;
		// if / else만 있을 경우
		if (fnum1 > fnum2) {
			select = 1;
			result1 = fnum1;
			result2 = fnum1 - fnum2;
		}
		else {
			select = 2;
			result1 = fnum2;
			result2 = fnum2 - fnum1;
		}
		System.out.printf("%d번째로 입력한 %.1f가 %.1f만큼 더 큽니다.\n", select, result1, result2);
		
		// if ~ else if ~ else의 경우 - 재배치하시고, else if에 집착하지 말 것
		if (fnum1 == fnum2) {
			System.out.println("서로 같습니다.");
		}
		else {
			if (fnum1 > fnum2) {
				select = 1;
				result1 = fnum1;
				result2 = fnum1 - fnum2;
			}
			else {
				select = 2;
				result1 = fnum2;
				result2 = fnum2 - fnum1;
			}
			System.out.printf("%d번째로 입력한 %.1f가 %.1f만큼 더 큽니다.\n", select, result1, result2);
		}
	}
}
