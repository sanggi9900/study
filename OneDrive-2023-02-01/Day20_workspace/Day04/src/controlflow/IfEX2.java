package controlflow;

import java.util.Scanner;

public class IfEX2 {
	public static void main(String[] args) {
		System.out.print("�Ǽ��� 2�� >> ");
		Scanner sc = new Scanner(System.in);
		double fnum1 = sc.nextDouble();
		double fnum2 = sc.nextDouble();
		int select = 0;
		double result1 = 0;
		double result2 = 0;
		// if / else�� ���� ���
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
		System.out.printf("%d��°�� �Է��� %.1f�� %.1f��ŭ �� Ů�ϴ�.\n", select, result1, result2);
		
		// if ~ else if ~ else�� ��� - ���ġ�Ͻð�, else if�� �������� �� ��
		if (fnum1 == fnum2) {
			System.out.println("���� �����ϴ�.");
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
			System.out.printf("%d��°�� �Է��� %.1f�� %.1f��ŭ �� Ů�ϴ�.\n", select, result1, result2);
		}
	}
}
