package controlflow;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		// ���ǹ��� ���� : �ɷ����� - ���ǹ��� ���ӹ����� ���ǹ� �ֱ�
		// - ���ӹ��� �ϳ��� �߰�ȣ�� ���� �� �ִ�.
		// - if ���ο� �־��� �ڵ�� ���ؾ� �Ѵ�.
		System.out.print("ũ�⸦ �Ǻ��� ���� >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// ���ǹ��� ���ġ�� �� �� ����
		// - �ɷ����� ������� �ڵ尡 ����ǵ��� ����� ��
		// - �ʿ���� �ڵ尡 ����� �̸� �� ��������� ��
		if (num >= 10) System.out.println("10���� ũ�ų� �����ϴ�.");
		else if (num > 0) System.out.println("0���� Ů�ϴ�.");
		else System.out.println("0���� �۰ų� �����ϴ�.");
	}
}
