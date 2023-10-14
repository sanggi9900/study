package controlflow;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		// switch 제어문 : if else의 선택을 좀 더 효율적으로 구성하기 위해 사용
		// - 조건식은 이미 잡혀 있음( == 관계연산자 )
		// - 조건식을 넣으면 안되고, 일치여부를 구할 수 있는 값으로만 설정
		// - 원시 자료형 중 명확하게 구별되는 정확한 것만 이용 가능
		Scanner sc = new Scanner(System.in);
		System.out.print("1. HELLO, 2. BYE >> ");
		int num = sc.nextInt();
		sc.close();
		// 스위치 - 선택을 극대화시킨 제어문
		// 특징 : case 및 default를 통해 코드의 시작지점을 결정한다.
		//      종속문의 종료를 위해, break를 사용한다.
		switch(num) {
		case 1:								// if (num == 1) {
			System.out.println("HELLO~!");	// 		System.out.println("HELLO~!");
			break;							// }
		case 2:								// if (num == 2) {
			System.out.println("BYE~!");	// 		System.out.println("BYE~!");
			break;							// }
		default:									// if(num != 1 && num != 2) {
			System.out.println("잘못된 선택입니다.");	// 		System.out.println("잘못된 선택입니다.");
			break; // 마지막은 생략 가능					// } 
		}
	}
}






