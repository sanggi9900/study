package basic;

import java.util.Scanner;

public class OpsEX4 {
	public static void main(String[] args) {
		// 1. �ڵ� �ڵ��ϼ� ����Ű : ctrl + space
		// 2. ��Ű�� �ڵ��ϼ� ����Ű : ctrl + shift + o
		System.out.print("ù��° ���� >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(num1 +"�� " + num2 +"�� ����ΰ�? " + (num1 % num2 == 0));
		System.out.printf("%d�� %d�� ����ΰ�? %b\n", num1, num2, num1%num2==0);
		System.out.printf(num1 + "�� %d�� ����ΰ�? " + (num1%num2==0), num2);
	}
}
