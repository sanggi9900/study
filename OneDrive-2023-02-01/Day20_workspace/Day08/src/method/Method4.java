package method;

import java.util.Scanner;
// ���� : �۲��� ������ �ȵ��
//      Windows -> Preference �� ������ ����â�� ������
//      General -> Appearance -> Colors and Fonts�� ����
//      ��Ͽ��� Java -> Java Text Editor Font���� Edit�� ���� ���� ����

public class Method4 {
	// �޼��带 ���� �� ����� �� : �ڵ��� �ߺ��� ó���ϱ� ���� ��
	// - 1ȸ�� �ڵ带 ���ؼ� ������ �ʴ´�.
	// - ��ȸ�� �ڵ��̸�, ���뼺�� ������ �Ѵ�.
	// - �޼���� �ұ�Ģ���� �ݺ��� ���Ͽ� �غ�Ǵ� �����̴�.
	public static int makeSum(int start, int end) {
		int result = 0;
		for (int i = start;i<=end;i+=1) {
			result += i;
		}
		return result;
	}
	public static void program1(Scanner sc) {
		System.out.print("���� �ϳ� �Է� >> ");
		int num = sc.nextInt();
		int result = makeSum(1, num);
		System.out.println(num+"������ �� : " + result);
	}
	public static void program2(Scanner sc) {
		System.out.print("���� �ϳ� �Է� >> ");
		int num = sc.nextInt();
		int result = makeSum(num, -1);
		System.out.println(num+"������ �� : " + result);
	}
	public static void main(String[] args) {
		// ��ȯ�� �Ű������� �� �� ���� - ���� �Է�/����� ����
		// -> �ܼ� ������ ������ �ʴ´�.
		// -> �ݺ�, ���ǹ� ���� ���� ���Ե� ������ �޼��尡 �ȴ�.
		Scanner sc = new Scanner(System.in);
		program1(sc);
		program2(sc);
		sc.close();
	}
}
