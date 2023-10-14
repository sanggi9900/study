package basic;
import java.util.Scanner; // #include <stdio.h>

public class Input {
	public static void main(String[] args) {
		// 입력객체 Scanner : 1)생성하고 2)쓴 다음에 3)정리한다.
		
		System.out.print("정수 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		// nextInt() : 입력한 것을 정수값으로 인식해서 저장
		// - 정수값 외에는 불가능
		int num = sc.nextInt();
		System.out.println("정수 : " + num);
		
		System.out.print("실수 입력 >> ");
		// nextDouble() : 입력한 것을 실수값으로 인식해서 저장
		// - 정수값 및 실수값이 가능
		double fnum = sc.nextDouble();
		System.out.println("실수 : " + fnum);
		
		// 자바의 입력은 기본적으로 문자입력이 없음.
		// - 문자열로 입력받고 나서, 한글자만 따오는 방식을 취한다.
		System.out.print("문자 입력 >> ");
		// next() : 문자열(단어) 입력용
		char ch = sc.next().charAt(0);
		System.out.printf("결과 : ->%c<-\n", ch);
		// ---- 입력된 것은 띄어쓰기/엔터로 구분됨
		
		// ---- 엔터에 의해서만 구분됨
		System.out.print("문장 입력 >> ");
		// nextLine() : 문자열(문장) 입력용
		sc.nextLine(); // 이전에 입력되는 '엔터'가 있다면 이를 입력받아 버린다.
		String msg = sc.nextLine(); // 이후에 새로 입력을 받는다.
		System.out.println("입력된 문장 : " + msg);
		
		System.out.print("단어 입력 >> ");
		String word = sc.next();
		System.out.println("결과 : " + word);
		
		// close : 더이상 입력받지 않음을 의미함. 재활용 불가능.
		sc.close();
	}
}







