package method;

public class MethodEX3 {
	// ���� �Է��� ���� ��� : Scanner ���� ���ؾ� �����ϱ⿡ ���뼺�� ��������.
	// �Ű������� ��ĥ ��� : �ܺο��� Scanner ������ ���� ���� �����ϱ⿡
	//                 ���� �Է°� ���縦 �ʿ信 ���� Ȱ���� �� �ִ�.
	public static void showMax(int num1,int num2,int num3) {
		// ���� ������ ���� ū ���� ù��°�� �����ϰ�
		// �������� �� ũ�� "ū ��" �� �����Ѵ�.
		if (num1 == num2 && num2 == num3) {
			System.out.println("���� �����ϴ�.");
		}
		else {
			int maxValue = num1;
			int count = 1;
			if (num2 > maxValue) {
				maxValue = num2;
				count = 2;
			}
			if (num3 > maxValue) {
				maxValue = num3;
				count = 3;
			}
			System.out.println("���� ū �� : " + maxValue + " " + count);
		}
	}
	public static void main(String[] args) {
		showMax(1,2,3);
		showMax(3,2,1);
		showMax(1,3,2);
		showMax(2,2,3);
		showMax(3,2,3);
		showMax(3,3,3);
	}
}
