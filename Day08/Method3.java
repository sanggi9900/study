package method;

import java.util.Scanner;

public class Method3 {
	public static void showSum(int num1, int num2) {
		System.out.println("결과 : " + (num1 + num2));
	}
	// 당장 필요한 형태 : Scanner를 생성후 공유받아 이용한다.
	public static void program(Scanner sc) {
		System.out.print("정수 2개 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("결과 : " + (num1 + num2));
	}
	public static void main(String[] args) {
		// ★★ 메서드 끼리는 변수를 공유하지 않는다.
		
		// 매개변수가 존재하는 메서드
		// 1) 필요한 것(자료)을 외부로부터 복사해서 받아온다
		//    입력을 대체하여 적용된다.
		showSum(10, 20);
		showSum(13, 12);
		
		// 2) 필요한 것을 투입시켰다가, 외부에서 뒷정리한다.
		Scanner sc= new Scanner(System.in);
		program(sc);
		sc.close();
	}
}



