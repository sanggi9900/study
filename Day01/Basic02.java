package basic;

public class Basic02 {
	public static void main(String[] args) {
		// 원시 자료형 : 복사만 되는 자료형
		boolean result1 = true;	// 참
		boolean result2 = false;// 거짓
		char ch = '한'; // 한글도 가능(2 Byte짜리)
		// byte : 파일전송을 위해서 사용하는 자료형
		// short : 작은 크기의 정수값을 위한 자료형 -> -32768 ~ +32767
		int count1 = 100; // -21억 ~ +21억
		long count2 = 988l; // -900경 ~ +900경
		float fnum1 = 3.14f; // 소수점 7자리까지만 저장
		double fnum2 = 3.14; // 소수점 16자리까지 저장 가능
		
		// 비원시 자료형 : 공유만 되는 자료형
		String name = "홍길동";
		// String rank = 'A'; 원시자료형과 호환이 안됨
	}
}










