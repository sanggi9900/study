package method;

import java.util.Scanner;

public class Method3 {
	public static void showSum(int num1, int num2) {
		System.out.println("��� : " + (num1 + num2));
	}
	// ���� �ʿ��� ���� : Scanner�� ������ �����޾� �̿��Ѵ�.
	public static void program(Scanner sc) {
		System.out.print("���� 2�� �Է� >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("��� : " + (num1 + num2));
	}
	public static void main(String[] args) {
		// �ڡ� �޼��� ������ ������ �������� �ʴ´�.
		
		// �Ű������� �����ϴ� �޼���
		// 1) �ʿ��� ��(�ڷ�)�� �ܺηκ��� �����ؼ� �޾ƿ´�
		//    �Է��� ��ü�Ͽ� ����ȴ�.
		showSum(10, 20);
		showSum(13, 12);
		
		// 2) �ʿ��� ���� ���Խ��״ٰ�, �ܺο��� �������Ѵ�.
		Scanner sc= new Scanner(System.in);
		program(sc);
		sc.close();
	}
}



