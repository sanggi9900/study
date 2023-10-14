package forstatement;

import java.util.Scanner;

public class ForEX1 {
	public static void main(String[] args) {
		// for는 유한반복용이고, while은 범용성이 좋음
		// - while만 써도 되는데, for는 무슨 목적인가?
		Scanner sc = new Scanner(System.in);
		System.out.print("HELLO 출력횟수 >> ");
		int count = sc.nextInt();
		
		// for 유한반복을 돌릴 때 제일 큰 특징
		// - 원하는 순서에 맞게 준비할 수 있는 융통성
		for (int x = 1; x <= count; x += 1) System.out.print("HELLO ");
		System.out.println();
		
		// while 유한반복을 돌릴 때 제일 큰 특징
		// - 순서에 관심이 없는 횟수 확보용
		while (count-- > 0) System.out.print("HELLO ");
		System.out.println();
	}
}






