package array;

import java.util.Scanner;

public class ArrayEX2 {
	public static void main(String[] args) {
		// �ݺ��� �Ȱ����Ŵ� ��ģ��? �ƴϴ�.
		// - �Է°� ó��/����� ��ġ�� �ʴ´�.
		
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[4];
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print((i + 1) + "�� ���� : ");
			arr[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("index : %d, char : %c\n", i, arr[i]);
		}
		
		sc.close();
	}
}
