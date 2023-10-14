package method;

import java.util.Scanner;

public class Method1 {
	public static void program(/*void 못넣는다. 주의 할 것*/) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("결과 : " + (num1 + num2));
	}
	public static void main(String[] args) {
		// 메서드 : 다른 언어의 함수에 대응되는 개념
		// 1) 기본형식의 메서드 : 완결된 절차를 가지고 있는 메서드.
		//    -> 외부와 상호작용하지 않는다.
		
		// 주의사항 : Scanner는 메서드에서 close 처리하면 안됨
		program();
		program();
		// 내부 절차 : 소스파일 -> 프로그램(하나만 돌아감) -> 
		//         입력통로를 자동으로 연결시킴(공유됨)
		//         sc.close()는 이 입력통로가 필요가 없으니
		//         차단(연결끊기)을 하는 것.
		//         해결책은 있으니 걱정말 것.
	}
}






