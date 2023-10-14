package controlflow;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		// 기본사용2 : else 추가하기
		// - 무조건 선택되는 선택지를 만들기 위해서 사용한다.
		// - 조건식의 부정결과를 이용한다.
		System.out.print("7의 배수를 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// 작성시 요령 - 경우의 수가 적은 것을 첫번째로 한다.
		if (num % 7 == 0) {
			System.out.println("참 잘했어요~");
		}
		// 이점1 : 둘 중 하나만 고른다
		// 이점2 : if만 사용했을 경우 발생하는 경우의 수의 중복을 피할 수 있다.
		else {
			System.out.println("뭔가 잘못되었어요~");
		}
	}
}
