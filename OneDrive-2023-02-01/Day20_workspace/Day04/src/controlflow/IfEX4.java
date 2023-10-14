package controlflow;

import java.util.Scanner;

public class IfEX4 {
	// 팁
	// 1) main만 적고  ctrl + space하면 자동완성 이용 가능
	// 2) sysout만 적고 ctrl + space하면 println으로 바꿔줌
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번 성적 >> ");
		double score1 = sc.nextDouble();
		System.out.print("2번 성적 >> ");
		double score2 = sc.nextDouble();
		System.out.print("3번 성적 >> ");
		double score3 = sc.nextDouble();
		sc.close();
		
		double avg = (score1 + score2 + score3)/3;
		char rank;
		if (avg >= 90) 		rank = 'A';
		else if (avg >= 80) rank = 'B';
		else if (avg >= 70) rank = 'C';
		else 				rank = 'F';
		
		System.out.printf("평균 : %.1f점( %c랭크 )\n", avg, rank);
		System.out.printf("1번차이 : %.1f점\n", score1 - avg);
		System.out.printf("2번차이 : %.1f점\n", score2 - avg);
		System.out.printf("3번차이 : %.1f점\n", score3 - avg);
	}
}










