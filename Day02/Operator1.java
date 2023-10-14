package basic;

public class Operator1 {
	public static void main(String[] args) {
		int countA = 100;
		System.out.println("A의 수량 : " + countA + "개");
		// 주의사항1 : 문자열과 섞어서 출력할 때, 소괄호를 묶어서 구분해야 함
		// - 문자열과 덧셈 : concatenate(연결하다)
		//   -> 덧셈 대상을 문자열로 바꿔서 이어 붙여서 하나로 만들어 준다.
		System.out.println("5개 늘어날 경우 : " + countA + 5 + "개");
		// - 연산자는 우선순위가 존재함
		//   -> 우선순위가 동일하면 왼쪽에서 오른쪽으로 2개씩 순차처리
		System.out.println("5개 늘어날 경우 : " + (countA + 5) + "개");
		System.out.println("9개 감소할 경우 : " + (countA - 9) + "개");
		System.out.println("2배가 된 경우 : " + (countA * 2) + "개");
		
		// 주의사항2 : 실수값과 연산하면 결과는 무조건 실수값이다
		System.out.println("2.5배가 된 경우 : " + (countA * 2.5) + "개");
		
		// 주의사항3 : 정수끼리는 몫만 구하고, 실수가 있어야만 소수점이 나온다.
		System.out.println("절반으로 감소할 경우 : " + (countA/2) + "개");
		System.out.println("1/3으로 감소할 경우 : " + (countA/3.0) + "개");
		
		// 주의사항4 : 자바에서는 나머지연산을 실수값도 할 수 있다.
		System.out.println(countA % 5.2);
		
		// 연산자 쓸 때 권장사항 : 특정 연산이 여러번 사용되면 저장한다.
		// - 1) 코드의 작동속도(효율성)을 올릴 수 있다.
		// - 2) 소괄호를 덜 쓸 수 있음
		int countB = countA + 10;
		System.out.printf("10개 증가했음 : %d개\n", countB);
		System.out.println("10개 증가했음 : " + countB + "개");
		// - 3) 더이상 이전값이 필요없다면 같은 곳에 저장. 필요하면 다른 곳에 저장.
		countA = countA + 10;
		System.out.printf("10개 증가했음 : %d개\n", countA);
		System.out.println("10개 증가했음 : " + countA + "개");
	}
}





