package array;

import java.util.Scanner;

public class ArrayEX4 {
	public static void main(String[] args) {
		// 항상 기억해둘 것 : 비교는 외부 요인이 아니라 내부에서만 이루어져야 한다.
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[8];
		System.out.println(scores.length + "개 과목의 점수를 입력하세요.");
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
		System.out.printf("제일 높은 점수 : %d번째 %d점\n", max_index+1, max);
		System.out.printf("제일 낮은 점수 : %d번째 %d점\n", min_index+1, min);
		
		sc.close();
	}
}
