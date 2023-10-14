package ifstate;

import java.util.Scanner;

public class IfEX3 {
	// 자동완성목록은 위아래 방향키로 골라서 엔터를 누르면 선택 가능
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A. HELLO\nB.GOOD BYE\n>> ");
		char menu = sc.next().charAt(0);
		// 팁 : 문자도 결국 정수이니 크기 비교 가능하지만...
		//     크기 비교를 할거면, 정수가 더 유리함
		//     문자는 한정된 수량 내에서 일치/불일치로 체크하는게 좋음
		if (menu == 'A') System.out.println("HELLO");
		else if (menu == 'B') System.out.println("GOOD BYE");
		else System.out.println("잘못된 입력");
		
		System.out.println("프로그램 종료");
	}
}
