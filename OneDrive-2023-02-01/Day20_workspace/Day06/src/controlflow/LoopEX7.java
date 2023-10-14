package controlflow;

import java.util.Scanner;

public class LoopEX7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = -1;
		while (limit < 0) {
			System.out.print("입력횟수 >> ");
			limit = sc.nextInt();
			if (limit < 0) System.out.println("재입력하세요");
		}
		
		double result = 0;
		for (int count = 1; count <= limit; count += 1) {
			System.out.print(count + "번 실수 >> ");
			result += sc.nextDouble();
		}
		sc.close();
		
		System.out.println("결과 : " + result);
	}
}
