package method;

public class MethodEXA {
	public static int getSum(int n1, int n2) {
		if (n1 == n2) return 0;
		else {
			int result = 0; int a = 0; int b = 0;
			if (n1 < n2) {
				a = n1; b = n2;
			}
			else {
				a = n2; b = n1;
			}
			while (a <= b) {
				result += a; a += 1;
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// �޼��� ��������
		// ���Ƿ� ������ ������ �������� ���� ���ϴ� �޼��带 �����ϼ���.
		// �Ű������� ��ȯ�� ��� �����մϴ�.
		int result1 = getSum( 1, 5);
		int result2 = getSum( 6,10);
		int result3 = getSum(10, 6);
		int result4 = getSum(-1,-5);
		int result5 = getSum( 5, 5);
		System.out.println("���1 : " + result1); // 15
		System.out.println("���2 : " + result2); // 40
		System.out.println("���3 : " + result3); // 40
		System.out.println("���4 : " + result4); // -15
		System.out.println("���5 : " + result5); // 0
	}
}
