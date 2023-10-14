package basic;
import java.util.Scanner;

public class InputEX1 {
	public static void main(String[] args) {
		// 기본적으로 입력된 것은 남는다.
		// - 입력(Scanner)을 계속 받으면 계속 저장 가능
		
		// 주의 : Console에서는 임의의 위치에 값을 입력받아
		//      이용하는 것은 안됨
		System.out.print("정수 2개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("실수 2개 입력 >> ");
		double fnum1 = sc.nextDouble();
		double fnum2 = sc.nextDouble();
		sc.close();
		System.out.println("첫번째 정수 : " + num1);
		System.out.println("두번째 정수 : " + num2);
		System.out.println("실수들 : " + fnum1 +", "+fnum2);
		System.out.printf("실수들 : %.1f, %.1f\n", fnum1, fnum2);
	}
}








