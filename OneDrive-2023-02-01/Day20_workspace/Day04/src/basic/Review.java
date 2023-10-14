package basic;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		System.out.print("정수 입력 >> "); // 줄바꿈 없는 출력
		Scanner sc = new Scanner(System.in); // 입력 : Scanner 객체를 이용한다.
		// 원시 : 복사만 되는 것 - 소문자로 시작함
		int num = sc.nextInt(); // bool, char, int, double
		
		System.out.print("단어 입력 >> ");
		// 비원시 : 공유만 되는 것 - 대문자로 시작함
		String word = sc.next();
		// Scanner는 뒷정리를 해야 한다.
		sc.close();
		
		// 연산자에 의해서 결과에 필요한 것을 만들게 된다.
		num += 5;
		word += "이 입력되었습니다.";
		
		System.out.println("5가 증가한 입력값 : " + num);
		System.out.printf("단어 : %s\n", word);
		System.out.println("프로그램이 종료되었습니다."); // 줄바꿈이 자동으로 붙는 출력
	}
}
