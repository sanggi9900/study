package controlflow;

import java.util.Scanner;

public class IfEX4 {
	// ��
	// 1) main�� ����  ctrl + space�ϸ� �ڵ��ϼ� �̿� ����
	// 2) sysout�� ���� ctrl + space�ϸ� println���� �ٲ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ���� >> ");
		double score1 = sc.nextDouble();
		System.out.print("2�� ���� >> ");
		double score2 = sc.nextDouble();
		System.out.print("3�� ���� >> ");
		double score3 = sc.nextDouble();
		sc.close();
		
		double avg = (score1 + score2 + score3)/3;
		char rank;
		if (avg >= 90) 		rank = 'A';
		else if (avg >= 80) rank = 'B';
		else if (avg >= 70) rank = 'C';
		else 				rank = 'F';
		
		System.out.printf("��� : %.1f��( %c��ũ )\n", avg, rank);
		System.out.printf("1������ : %.1f��\n", score1 - avg);
		System.out.printf("2������ : %.1f��\n", score2 - avg);
		System.out.printf("3������ : %.1f��\n", score3 - avg);
	}
}










