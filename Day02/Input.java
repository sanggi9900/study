package basic;
import java.util.Scanner; // #include <stdio.h>

public class Input {
	public static void main(String[] args) {
		// �Է°�ü Scanner : 1)�����ϰ� 2)�� ������ 3)�����Ѵ�.
		
		System.out.print("���� �Է��ϼ��� >> ");
		Scanner sc = new Scanner(System.in);
		// nextInt() : �Է��� ���� ���������� �ν��ؼ� ����
		// - ������ �ܿ��� �Ұ���
		int num = sc.nextInt();
		System.out.println("���� : " + num);
		
		System.out.print("�Ǽ� �Է� >> ");
		// nextDouble() : �Է��� ���� �Ǽ������� �ν��ؼ� ����
		// - ������ �� �Ǽ����� ����
		double fnum = sc.nextDouble();
		System.out.println("�Ǽ� : " + fnum);
		
		// �ڹ��� �Է��� �⺻������ �����Է��� ����.
		// - ���ڿ��� �Է¹ް� ����, �ѱ��ڸ� ������ ����� ���Ѵ�.
		System.out.print("���� �Է� >> ");
		// next() : ���ڿ�(�ܾ�) �Է¿�
		char ch = sc.next().charAt(0);
		System.out.printf("��� : ->%c<-\n", ch);
		// ---- �Էµ� ���� ����/���ͷ� ���е�
		
		// ---- ���Ϳ� ���ؼ��� ���е�
		System.out.print("���� �Է� >> ");
		// nextLine() : ���ڿ�(����) �Է¿�
		sc.nextLine(); // ������ �ԷµǴ� '����'�� �ִٸ� �̸� �Է¹޾� ������.
		String msg = sc.nextLine(); // ���Ŀ� ���� �Է��� �޴´�.
		System.out.println("�Էµ� ���� : " + msg);
		
		System.out.print("�ܾ� �Է� >> ");
		String word = sc.next();
		System.out.println("��� : " + word);
		
		// close : ���̻� �Է¹��� ������ �ǹ���. ��Ȱ�� �Ұ���.
		sc.close();
	}
}







