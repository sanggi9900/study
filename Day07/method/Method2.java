package method;

import java.util.Scanner;

public class Method2 {
	// 반환/매개변수가 있을 경우 대부분 동사형으로 설정된다.
	// - 메서드는 소문자로 시작한다.( ex) compareTo ) 
	public static int getSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개  >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// return : 메서드 외부에서 값으로 쓸 수 있도록 출력하는 코드
		return (num1 + num2);
	}
	// 반환은 필요에 따라서 임의로 지정할 수 있음
	// - 1) Scanner 처럼 뒷정리가 필요한 것
	// - 2) 절차가 정상작동했는지 여부(true / false)
	public static Scanner program(/*void 못넣는다. 주의 할 것*/) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("결과 : " + (num1 + num2));
		return sc;
	}
	public static void main(String[] args) {
		// 반환형이 존재하는 메서드 : 가장 가치가 있는 것을 함수 외부에서
		//                     쓸 수 있도록 해준다.
		int num1 = getSum();
		int num2 = getSum();
		System.out.println("결과 : " + (num1 + num2));
		// 응용할 경우
		Scanner sc = program();
		sc.close();
	}
}




