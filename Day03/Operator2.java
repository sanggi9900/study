package basic;

public class Operator2 {
	public static void main(String[] args) {
		// ���Կ��� : ���� ������ �����Ѵ�.
		// - ���� �ڷ����� ��� : ����
		// - ����� �ڷ����� ��� : ����
		int num1 = 100;
		int num2 = num1; // ����
		String word1 = "ABC";
		String word2 = word1; // ����

		// ���մ��� : ���� ����� �ٿ��� �Ǽ��� ���̴� ��
		// - ������ ����� ���� ���� ��������.
		num1 = num1 + 10;
		num1 += 10;
		// - ������ ����� ���� ������ ���������� �ȵ�.
		// int num3; num3 += 100; �ȵ�
		
		// ���������� : ���մ����� Ư�� ������ �� �ٿ��� ��
		num2+=1;
		num2++; // ��ġ
		System.out.println(num2);
		++num2; // ��ġ
		System.out.println(num2);
		// �� ���� : ����/���ҿ����� �ٸ� ����Ŀ� ���� ����.
		int result1 = num2--;
		/*
		 * int result1 = num2;
		 * num2 -= 1;
		 */
		System.out.println(result1 + " " + num2);
		int result2 = --num2;
		/*
		 * num2 -= 1;
		 * int result2 = num2;
		 */
		System.out.println(result2 + " " + num2);
	}
}






