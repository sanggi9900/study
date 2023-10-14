package basic;

public class Operator2 {
	public static void main(String[] args) {
		// 대입연산 : 값을 변수에 저장한다.
		// - 원시 자료형의 경우 : 복사
		// - 비원시 자료형의 경우 : 공유
		int num1 = 100;
		int num2 = num1; // 복사
		String word1 = "ABC";
		String word2 = word1; // 공유

		// 복합대입 : 변수 사용을 줄여서 실수를 줄이는 것
		// - 기존에 저장된 값에 대한 누적연산.
		num1 = num1 + 10;
		num1 += 10;
		// - 기존에 저장된 값이 없으면 누적연산이 안됨.
		// int num3; num3 += 100; 안됨
		
		// 증감연산자 : 복합대입중 특정 연산을 더 줄여준 것
		num2+=1;
		num2++; // 후치
		System.out.println(num2);
		++num2; // 전치
		System.out.println(num2);
		// 주 목적 : 증가/감소연산을 다른 연산식에 섞어 쓴다.
		int result1 = num2--;
		/*
		 * int result1 = num2;
		 * num2 -= 1;
		 */
		System.out.println(result1 + " " + num2);
		int result2 = --num2;
		/*
		 * num2 -= 1;
		 * int result2 = num2;
		 */
		System.out.println(result2 + " " + num2);
	}
}






