package method;

import java.util.Scanner;

public class MethodEX2 {
	public static int getSum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� ���� >> ");
		int value = sc.nextInt();
		int result = 0;
		// 1 + 2 + 3 == 3 + 2 + 1
		// - ���ſ� ���ؼ� �����غ���...
		while (0 != value) {
			result += value;
			if (value > 0) value -= 1;
			else           value += 1;
		}
		// ��ȯ���� �ϳ��ۿ� �ȵǴ� Scanner ������ ����
		return result;
	}
	public static void main(String[] args) {
		int result1= getSum();
		int result2= getSum();
		System.out.println("ù��° �� : " + result1);
		System.out.println("ù��° �� : " + result2);
	}
}









