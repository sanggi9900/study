package part1;

import java.util.Scanner;

public class ArrayEX1 {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� �Է� >> ");
		int size = sc.nextInt();
		*/
		// new int[����] - �����Ǵ� ������ ������
		int[] arr = new int[3];
		// ���� ä��� �͵� ������ �����Ǹ� �ݺ����� ����������� ��
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// { ��1, ��2, ... } - ���� ������ �������� �� ��
		// int[] arr = { 10, 20, 30 };
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("index : %d, value : %d\n", i, arr[i]);
		}
	}
}
