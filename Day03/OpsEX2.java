package basic;
import java.util.Scanner;

public class OpsEX2 {
	public static void main(String[] args) {
		System.out.print("�Ǽ� 3�� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		double fnum1 = sc.nextDouble();
		double fnum2 = sc.nextDouble();
		double fnum3 = sc.nextDouble();
		sc.close();
		double avg = (fnum1 + fnum2 + fnum3) / 3;
		System.out.printf("��� : %.2f\n", avg);
		System.out.println("�ݿø����ɿ��� : " + (avg % 1 >= 0.5));
		// ������ : �����Ⱑ �ƴ�. �ڵ����� �ݺ��ؼ� ����Ǵ� ����.
		// - �������� 1�� ��� ���� ����̰�, �������� ���̻� �� �� ���� ��
		// + ������������ �ϴ� ������ �� ū ����� ������ ����
		System.out.println((-3.9 % 1) + " " + (3.9 % 1));
	}
}
