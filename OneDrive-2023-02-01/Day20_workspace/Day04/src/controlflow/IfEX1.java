package controlflow;

import java.util.Scanner;

public class IfEX1 {
	public static void main(String[] args) {
		System.out.print("������ �Է� >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("�Էµ� �� : " + num);
		// ���� ������ ���� �ڵ尡 �˾ƺ��� ������
		if (num < 0) {
			System.out.println("�����Դϴ�.");
		}
	}
}
