package controlflow;

import java.util.Scanner;

public class LoopEX1 {
	// �� : �ڵ��ϼ����� ���� ������ �ȵ� ��� ESCŰ�� ��������.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num%2==0) {
			System.out.print("Ȧ�� �Է� >> ");
			num = sc.nextInt();
		}
		System.out.println("�غ�Ǵ� �� : " + num);
		
		// �Ʒ��� ���� ��ĵ� ������
		// - ������� break�� Ȱ���ϴ� ���
		// - ����ҷ��� ���ǹ��� �ݵ�� �ʿ��ϴ� ������ ��
		while (true) {
			System.out.print("Ȧ�� �Է� >> ");
			num = sc.nextInt();
			if (num%2!=0) {
				break; // �ݺ��� �߰��� �����Ű�� ���
			}
		}
		System.out.println("�غ�Ǵ� �� : " + num);
		
		sc.close();
	}
}







