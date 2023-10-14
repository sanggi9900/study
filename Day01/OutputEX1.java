package basic;

public class OutputEX1 {
	public static void main(String[] args) {
		// 자바의 문법 : 변수는 필요할 때 만든다.
		// - C / C++ 마냥 미리 만들지 않는다.
		
		// - 변수의 선언은 해당 변수가 사용될 범위를 지정하는 의미를 가진다.
		int num = 10;
		System.out.println("정수값 : " + num);
		
		double pi = 3.14;
		System.out.println("실수값 : " + pi + '\n');
		
		char ch = 'A';
		String fruit = "Apple";
		System.out.println("문자 : "+ ch + 
				"\n문자열 : " + fruit);
		
	}
}
