package controlflow;

import java.util.Scanner;

public class LoopEX5 {
	public static void main(String[] args) {
		// ���� ���� ���Ǵ� ���� - ���ѹݺ��Է� + ���ѹݺ�����
		// - �ʿ��� �͸� �ɷ� �ݺ����� ��ǻ�ͷ� ��� ������ ����
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num <= 0) {
			System.out.print("��� �Է� >> ");
			num = sc.nextInt();
		} sc.close();
		System.out.println("�ùٸ� ���Դϴ�.");
		int result1 = 0;
	
		for (int value = num; value > 0;value -=1) {
			result1 += value;
		}
		int result2 = 0;
		while (num > 0) {
			result2 += num;
			num -= 1;
		}
		
		System.out.println("while�� �̿��� �� : " + result1);
		System.out.println("for�� �̿��� �� : " + result2);
	}
}
