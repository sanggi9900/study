package controlflow;

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		// ���ǹ� : �ڵ带  ��Ȳ�� ���缭 �����ϱ� ���� ���
		// - ��Ȳ �Ǵ��� ���� ���ǽ�(���迬���� �� ��������)�� ���ȴ�.
		
		// �⺻���1 : if�� ����ϱ� - �߰�����
		System.out.print("¦��/Ȧ������ �Ǵ� >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		// - ���ǻ��� : ��ġ�� ����� ���� ������ ������ش�.
		System.out.println("��� : " + num);
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�~");
		}
		if (num % 2 != 0) {
			System.out.println("Ȧ���Դϴ�~");
		}
	}
}
