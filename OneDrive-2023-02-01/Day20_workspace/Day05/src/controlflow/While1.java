package controlflow;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		// ���ѹݺ� - �츮�� �̿��� ���� �Է��� �޾ƾ߸� �����Ѵ�.
		// - �⺻���ٹ�� : ���ǹ�
		Scanner sc = new Scanner(System.in);
		int score = -1;
		// ���ǹ��� �Ѱ� : 1ȸ ����
		// - �ݺ����� 1ȸ�������� ������ �ʵ��� �ϴ� ��
		while (score < 0 || score > 100) {
			System.out.print("���� �Է� >> ");
			score = sc.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		sc.close();
		System.out.println("�ùٸ� ���� : " + score);
	}
}
