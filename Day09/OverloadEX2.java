package method;

public class OverloadEX2 {
	// �����ε��� ������ �� : ��ȯ���� �ǵ��� ��ġ������� �Ѵ�.
	// - �ּ������� ����/����/�� ������ ī�װ��� ������� ��
	public static int getSum(int num) {
		int result = 0;
		if (num < 0) {
			for (int i = -1; i>=num;i-=1) {
				result += i;
			}
		}
		else {
			for (int i = 1; i<=num;i+=1) {
				result += i;
			}
		}
		return result;
	}
	public static int getSum(double fnum) {
		// System.out.println("����Ұ�");
		return 0;
	}
	public static int getSum(String word) {
		// System.out.println("����Ұ�");
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("�� : " + getSum(-5));
		System.out.println("�� : " + getSum(15));
		System.out.println("�� : " + getSum(3.14));
		System.out.println("�� : " + getSum("8"));
	}
}
