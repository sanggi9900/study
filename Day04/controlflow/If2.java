package controlflow;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		// �⺻���2 : else �߰��ϱ�
		// - ������ ���õǴ� �������� ����� ���ؼ� ����Ѵ�.
		// - ���ǽ��� ��������� �̿��Ѵ�.
		System.out.print("7�� ����� �Է��ϼ��� >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// �ۼ��� ��� - ����� ���� ���� ���� ù��°�� �Ѵ�.
		if (num % 7 == 0) {
			System.out.println("�� ���߾��~");
		}
		// ����1 : �� �� �ϳ��� ����
		// ����2 : if�� ������� ��� �߻��ϴ� ����� ���� �ߺ��� ���� �� �ִ�.
		else {
			System.out.println("���� �߸��Ǿ����~");
		}
	}
}
