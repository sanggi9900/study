package basic;
import java.util.Scanner;

public class InputEX1 {
	public static void main(String[] args) {
		// �⺻������ �Էµ� ���� ���´�.
		// - �Է�(Scanner)�� ��� ������ ��� ���� ����
		
		// ���� : Console������ ������ ��ġ�� ���� �Է¹޾�
		//      �̿��ϴ� ���� �ȵ�
		System.out.print("���� 2�� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("�Ǽ� 2�� �Է� >> ");
		double fnum1 = sc.nextDouble();
		double fnum2 = sc.nextDouble();
		sc.close();
		System.out.println("ù��° ���� : " + num1);
		System.out.println("�ι�° ���� : " + num2);
		System.out.println("�Ǽ��� : " + fnum1 +", "+fnum2);
		System.out.printf("�Ǽ��� : %.1f, %.1f\n", fnum1, fnum2);
	}
}








