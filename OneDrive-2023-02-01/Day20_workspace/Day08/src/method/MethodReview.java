package method;

import java.util.Scanner;

public class MethodReview {
	// �⺻���� - ������ ���α׷�(����)
	public static void program() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ��� 2�� �Է� >> ");
		double avg = sc.nextDouble() + sc.nextDouble();
		avg /= 2;
		System.out.println("��� : " + avg);
		System.out.println("������ : " + (int)avg);
		System.out.println("�Ǽ��� : " + avg % 1);
	}
	// ��ȯ���� ������ - ���� ��ġ�� �ִ� ���� ������ ����Ѵ�.
	public static double getAvg() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ��� 2�� �Է� >> ");
		double avg = sc.nextDouble() + sc.nextDouble();
		return avg / 2;
	}
	public static void main(String[] args) {
		// �޼��� : �ٸ� ���� �Լ��� �����Ǵ� ����
		// �Լ� - �ܼ��� ���
		// �޼��� - ����Ǿ� �ִ� ����
		
		// �޼����� ������ ��ȯ�� ���� / �Ű������� ������ ���� �޶���
		program();
		System.out.println("���1 : " + getAvg());
		System.out.println("���2 : " + getAvg());
	}
}
