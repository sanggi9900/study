package controlflow;

import java.util.Scanner;

public class WhileReview {
	public static void main(String[] args) {
		// ���ѹݺ� - �Է��� ������ �������� �ʴ´�.
		// - ���ǹ�ó�� ��.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num == 0) {
			System.out.print("���� �ϳ� �Է� >> ");
			num = sc.nextInt();
		}
		sc.close();
		// ���ѹݺ� - Ư��Ƚ��/�������� �غ��ϴ� ���� ����
		// - ��Ģ���� �ľ��� �� �ؾ� �Ѵ�(���� -> ���� -> ���� -> ����)
		if (num > 0) {
			while (num >= 1) {
				System.out.print(num + " ");
				num -= 1;
			} System.out.print("\n");
		}
		else {
			while (num <= -1) {
				System.out.print(num + " ");
				num += 1;
			} System.out.print("\n");
		}
	}
}





