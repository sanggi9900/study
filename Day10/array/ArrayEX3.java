package array;

import java.util.Scanner;

public class ArrayEX3 {
	public static void main(String[] args) {
		// 1ȸ�� ����̸� �迭�� �ʿ����
		// ��ȸ ����̸� �迭�� �־�� �ڵ� ������ ��������.
		Scanner sc = new Scanner(System.in);
		
		// ��  �迭�� ������, Ȯ���ϰ� ������ �ǵ��� �����ش�.
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print((i + 1) + "�� �� >> ");
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		for (int i = 0; i < arr.length; i += 1) {
			result += arr[i];
		}
		System.out.print("�� : ");
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print(arr[i] + " ");
		} System.out.print("\n");
		
		System.out.println("�� : " + result);
		System.out.println("��� : " + ((double)result / arr.length));
		
		sc.close();
	}
}
