package basic;
import java.util.Scanner;

public class OpsEX2 {
	public static void main(String[] args) {
		System.out.print("실수 3개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		double fnum1 = sc.nextDouble();
		double fnum2 = sc.nextDouble();
		double fnum3 = sc.nextDouble();
		sc.close();
		double avg = (fnum1 + fnum2 + fnum3) / 3;
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("반올림가능여부 : " + (avg % 1 >= 0.5));
		// 나머지 : 나누기가 아님. 자동으로 반복해서 진행되는 뺄셈.
		// - 나눗셈의 1은 모든 수의 약수이고, 나머지는 더이상 뺄 수 없는 수
		// + 나머지연산을 하는 수보다 더 큰 결과가 나오지 않음
		System.out.println((-3.9 % 1) + " " + (3.9 % 1));
	}
}
