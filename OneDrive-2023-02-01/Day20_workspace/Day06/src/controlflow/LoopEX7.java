package controlflow;

import java.util.Scanner;

public class LoopEX7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = -1;
		while (limit < 0) {
			System.out.print("�Է�Ƚ�� >> ");
			limit = sc.nextInt();
			if (limit < 0) System.out.println("���Է��ϼ���");
		}
		
		double result = 0;
		for (int count = 1; count <= limit; count += 1) {
			System.out.print(count + "�� �Ǽ� >> ");
			result += sc.nextDouble();
		}
		sc.close();
		
		System.out.println("��� : " + result);
	}
}
