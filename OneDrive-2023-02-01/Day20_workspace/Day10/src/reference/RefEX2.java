package reference;

import java.util.Scanner;

public class RefEX2 {
	public static void inputArr(int[] arr) {
		Scanner sc =new Scanner(System.in);
		for (int i = 0; i< arr.length; i += 1) {
			System.out.print("����" + (i + 1) + " �Է� >> ");
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		inputArr(arr);
		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("��%d : %d\n", i + 1, arr[i]);
		}
	}
}
