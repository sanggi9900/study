package basic;
import java.util.Scanner;

public class OutputEX3 {
	public static void main(String[] args) {
		System.out.print("���� 3�� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		// ���� ������ �ƴ� ���, �񱳳� ������ ����� �ȵ� �� ����
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		char ch3 = sc.next().charAt(0);
		sc.close();
		
		System.out.printf("1��° �� : %s %s %s\n", ch1, ch2, ch3);
		System.out.println("2��° �� : " + ch1 + ch2 + ch3 + ' ' + ch3 + ch2 + ch1);
		System.out.printf("3��° �� : %s %s %s\n", ch3, ch2, ch1);
	}
}
