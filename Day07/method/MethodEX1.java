package method;

import java.util.Scanner;

public class MethodEX1 {
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� >> ");
		int num2 = sc.nextInt();
		System.out.println("�� : " + (num1 + num2));
		System.out.println("�� : " + (num1 - num2));
		System.out.println("�� : " + (num1 * num2));
		String result;
		// ���ڿ��� �������� ��ġ��
		if (num2 == 0) result = "����Ұ�";
		else 		   result = "" + (num1 / num2);
		System.out.print("�� : " + result);
	}
	public static void main(String[] args) {
		calculator();
	}
}





