package method;

import java.util.Scanner;

public class MethodRE {
	public static int testMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		System.out.println("��� : " + num);
		if (num > 0) 		return  1;
		else if (num == 0)  return  0;
		else 				return -1;
	}
	
	public static void main(String[] args) {
		// �������� - ��ȯ���� �����ϴ� �޼����Դϴ�.
		// ������ ������ �Է��� �޾� ����մϴ�.
		// �������� ������ ���� �Ʒ��� ����� ���ɴϴ�.
		// - 1) ��� : 1
		// - 2) ���� : -1
		// - 3) ��(0) : 0
		
		// 10�� �Է��ϸ� "ù��° : 1" �̶�� ��µ˴ϴ�.
		System.out.println("ù��° : " + testMethod() );
		// -101�� �Է��ϸ� "�ι�° : -1" �̶�� ��µ˴ϴ�.
		System.out.println("�ι�° : " + testMethod() );
		// 0�� �Է��ϸ� "����° : 0" �̶�� ��µ˴ϴ�.
		System.out.println("����° : " + testMethod() );
	}
}
