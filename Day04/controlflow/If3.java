package controlflow;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		// 조건문의 응용 : 걸러내기 - 조건문의 종속문으로 조건문 넣기
		// - 종속문이 하나면 중괄호를 없앨 수 있다.
		// - if 내부에 넣어진 코드는 피해야 한다.
		System.out.print("크기를 판별할 정수 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// 조건문은 재배치가 될 수 있음
		// - 걸러내는 방식으로 코드가 실행되도록 맞춰야 함
		// - 필요없는 코드가 생기니 이를 잘 정리해줘야 함
		if (num >= 10) System.out.println("10보다 크거나 같습니다.");
		else if (num > 0) System.out.println("0보다 큽니다.");
		else System.out.println("0보다 작거나 같습니다.");
	}
}
