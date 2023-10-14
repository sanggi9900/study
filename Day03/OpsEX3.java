package basic;
import java.util.Scanner;

public class OpsEX3 {
	public static void main(String[] args) {
		// equals() : 서로 보관된 값이 같은지 여부를 알려줌
		// - 순수하게 일치/불일치여부만 체크 가능
		// compareTo( ) : 결과값이 숫자임
		// - 일치불일치 여부를 따지는데, 음수/양수가 필요한가?
		System.out.print("문자 2개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		// charAt( 인덱스 ) : 문자열 인덱싱
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		System.out.print("단어 2개 입력 >> ");
		String word1 = sc.next();
		String word2 = sc.next();
		System.out.println("문자 2개 불일치여부 : " + (ch1 != ch2));
		System.out.println("단어 2개 일치여부 : " + (word1.compareTo(word2) == 0));
	}
}
