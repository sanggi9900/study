package basic;
import java.util.Scanner;

public class OutputEX3 {
	public static void main(String[] args) {
		System.out.print("문자 3개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		// 원시 변수가 아닐 경우, 비교나 연산이 제대로 안될 수 있음
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		char ch3 = sc.next().charAt(0);
		sc.close();
		
		System.out.printf("1번째 줄 : %s %s %s\n", ch1, ch2, ch3);
		System.out.println("2번째 줄 : " + ch1 + ch2 + ch3 + ' ' + ch3 + ch2 + ch1);
		System.out.printf("3번째 줄 : %s %s %s\n", ch3, ch2, ch1);
	}
}
