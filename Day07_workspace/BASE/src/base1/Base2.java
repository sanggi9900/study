package base1;

public class Base2 {
	public static void main(String[] args) {
		// 변수 : 자료(값)를 저장하기 위한 공간
		// 카멜표기법 : 단어가 바뀔 때 대문자로 시작함
		
		// boolean : 논리값을 저장하기 위함
		// - JAVA의 각종 논리연산의 결과물
		boolean isTrue;
		boolean isFalse = false; // true / false
		
		// 숫자계열 자료형
		// short : 정수값 -32768 ~ +32767
		short count = 100;
		// int : 정수값 -21억 ~ +21억
		int age = -65;
		// long : 정수값 경단위의 정수값을 저장
		long peopleCount = 158754123458l; // 소문자 l이 추가됨
		// float : 실수값 소수점 6자리까지 보증함
		float value1 = 3.14f; // 소문자 f가 추가됨
		// double : 실수값 소수점 15자리까지 보증함
		double value2 = 3.14;
		
		// byte : 숫자계산용이 아님. 파일전송을 위한 자료형. 2 Byte단위
		
		// 문자계열
		// char : 문자값을 다루기 위한 자료형. 2 Byte단위
		char rank = 'A';
		char firstName = '고';
		
		// String : 비원시 자료형. 문자열을 표한하기 위한 것
		String word1 = null; 			// 변수 자체가 없음. 변수는 이름에 불과함.
		String word2 = new String(); 	// 비원시 자료형의 생성.
		String word3 = "Apple Pie ~ !"; // 문자열은 문법단위로 통합되어 있음
		String word4 = ""; 				// new String() 과 동등함
		
		// boolean, int, double, char, String 5가지를 주로 이용함
	}
}





