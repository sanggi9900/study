package array;

import java.util.Scanner;

public class ArrayEX4 {
	public static void main(String[] args) {
		// �׻� ����ص� �� : �񱳴� �ܺ� ������ �ƴ϶� ���ο����� �̷������ �Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[8];
		System.out.println(scores.length + "�� ������ ������ �Է��ϼ���.");
		for (int i = 0; i < scores.length; i += 1) {
			scores[i] = sc.nextInt();
		}
		int max = scores[0];	int max_index = 0;
		for (int i = 1; i < scores.length; i += 1) {
			if (scores[i] > max) {
				max = scores[i];
				max_index = i;
			}
		}
		int min = scores[0];	int min_index = 0;
		for (int i = 1; i < scores.length; i += 1) {
			if (scores[i] < min) {
				min = scores[i];
				min_index = i;
			}
		}
		System.out.printf("���� ���� ���� : %d��° %d��\n", max_index+1, max);
		System.out.printf("���� ���� ���� : %d��° %d��\n", min_index+1, min);
		
		sc.close();
	}
}
