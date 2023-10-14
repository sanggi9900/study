package basic;
import java.util.Scanner;

public class OpsEX1 {
	public static void main(String[] args) {
		// 값의 종류가 다르면? -> 자동형변환
		System.out.print("정수, 실수 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double fnum = sc.nextDouble();
		sc.close();
		System.out.printf("덧셈 결과 : %.2f\n", num + fnum);
		System.out.printf("곱셈 결과 : %.2f\n", num * fnum);
		System.out.printf("나누기 : %.2f\n", num / fnum);
		System.out.printf("나머지 : %.2f\n", num % fnum);
		// 정수값끼리 나누기(실수값) 보고 싶을 경우 형변환을 한다.
		// - 원시 자료형끼리만 가능. 비원시는 불가능.
		System.out.printf("정수끼리 실수결과 : %.2f", num / (double)3);
	}
}
