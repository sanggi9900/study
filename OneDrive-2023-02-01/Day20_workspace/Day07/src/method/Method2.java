package method;

import java.util.Scanner;

public class Method2 {
	// ��ȯ/�Ű������� ���� ��� ��κ� ���������� �����ȴ�.
	// - �޼���� �ҹ��ڷ� �����Ѵ�.( ex) compareTo ) 
	public static int getSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2��  >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// return : �޼��� �ܺο��� ������ �� �� �ֵ��� ����ϴ� �ڵ�
		return (num1 + num2);
	}
	// ��ȯ�� �ʿ信 ���� ���Ƿ� ������ �� ����
	// - 1) Scanner ó�� �������� �ʿ��� ��
	// - 2) ������ �����۵��ߴ��� ����(true / false)
	public static Scanner program(/*void ���ִ´�. ���� �� ��*/) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2�� �Է� >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("��� : " + (num1 + num2));
		return sc;
	}
	public static void main(String[] args) {
		// ��ȯ���� �����ϴ� �޼��� : ���� ��ġ�� �ִ� ���� �Լ� �ܺο���
		//                     �� �� �ֵ��� ���ش�.
		int num1 = getSum();
		int num2 = getSum();
		System.out.println("��� : " + (num1 + num2));
		// ������ ���
		Scanner sc = program();
		sc.close();
	}
}




