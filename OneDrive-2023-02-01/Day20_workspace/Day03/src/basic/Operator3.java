package basic;
import java.util.Scanner;

public class Operator3 {
	public static void main(String[] args) {
		// 관계연산자 : 크기 비교
		System.out.print("정수 2개 >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// 연산결과는 정수가 아니라, boolean(논리값)이니 주의
		System.out.println("결과1 " + (num1 > num2));
		System.out.println("결과2 " + (num1 < num2));
		System.out.println("결과3 " + (num1 >= num2));
		System.out.println("결과4 " + (num1 <= num2));
		System.out.println("결과5 " + (num1 == num2));
		System.out.println("결과6 " + (num1 != num2));
		// -------------- 원시 자료형일 경우 : 똑같은 동작
		
		// -------------- 비원시일 경우 관계연산자는 쓰면 안됨
		// C / C++ : 동적할당받은 저장공간
		// 파이썬 : 새롭게 만들어낸 서로 다른 리스트 2개(내부의 값은 같음)
		// - 비원시에 대해 관계연산을 쓰면 저장공간/리스트 그자체를 비교함
		// - 컵의 내용물이 중요한데, 컵 그자체를 비교하는 꼴이 됨
		String word1 = "ABC";
		System.out.println("비원시 결과1 : " + (word1 == "ABC"));
		String word2 = "ABC";
		System.out.println("비원시 결과2 : " + (word2 == "ABC"));
		String word3 = sc.next();
		System.out.println("비원시 결과3 : " + (word3 == word1));
		sc.close();
		
		// 객체의 비교는 전용 메서드를 통해서 수행한다.
		// - compareTo( ) : 내용물을 비교하고, 같으면 0, 다르면 0 이외의 값
		System.out.println("올바른 결과1 : " + word3.compareTo(word1));
		// 양수결과 : 내가 더 느린 순번(+ 내가 얼마나 더 긴가)
		System.out.println("올바른 결과2 : " + word3.compareTo("AB"));
		// 음수결과 : 내가 더 빠른 순번(ABC, CD보다 먼저 있다)
		System.out.println("올바른 결과3 : " + word3.compareTo("CD"));
		// ★ 나중에 정렬할 때 아주 중요함!
		
		double dis = 14.1;
		// 논리곱(조건식들을 만족하는 유일한 하나)
		// -> 14인치대 화면크기를 찾고 있음
		System.out.println("논리곱 : "
				+ ((14 <= dis) && (dis < 15)));
		// 논리합(조건식들을 하나이상 만족하는 여러개)
		// -> 14인치 또는 15인치대 화면크기를 찾고 있음
		System.out.println("논리합 : " +
				 ((14 <= dis) && (dis < 15) || (15 <= dis) && (dis < 16))
				 );
		// 부정(조건식 재활용)
		// -> 조건식의 결과를 부정하는데 이용함(긍정->부정, 부정->긍정)
		boolean result1 = (14 <= dis) && (dis < 15);
		boolean result2 = !result1; // (14 > dis) || (dis >= 15);
		System.out.println("부정 : " + result1 + " " + result2);
	}
}





