package basic;
import java.util.Scanner;

public class OpsEX1 {
	public static void main(String[] args) {
		// ���� ������ �ٸ���? -> �ڵ�����ȯ
		System.out.print("����, �Ǽ� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double fnum = sc.nextDouble();
		sc.close();
		System.out.printf("���� ��� : %.2f\n", num + fnum);
		System.out.printf("���� ��� : %.2f\n", num * fnum);
		System.out.printf("������ : %.2f\n", num / fnum);
		System.out.printf("������ : %.2f\n", num % fnum);
		// ���������� ������(�Ǽ���) ���� ���� ��� ����ȯ�� �Ѵ�.
		// - ���� �ڷ��������� ����. ����ô� �Ұ���.
		System.out.printf("�������� �Ǽ���� : %.2f", num / (double)3);
	}
}
