package basic;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		System.out.print("���� �Է� >> "); // �ٹٲ� ���� ���
		Scanner sc = new Scanner(System.in); // �Է� : Scanner ��ü�� �̿��Ѵ�.
		// ���� : ���縸 �Ǵ� �� - �ҹ��ڷ� ������
		int num = sc.nextInt(); // bool, char, int, double
		
		System.out.print("�ܾ� �Է� >> ");
		// ����� : ������ �Ǵ� �� - �빮�ڷ� ������
		String word = sc.next();
		// Scanner�� �������� �ؾ� �Ѵ�.
		sc.close();
		
		// �����ڿ� ���ؼ� ����� �ʿ��� ���� ����� �ȴ�.
		num += 5;
		word += "�� �ԷµǾ����ϴ�.";
		
		System.out.println("5�� ������ �Է°� : " + num);
		System.out.printf("�ܾ� : %s\n", word);
		System.out.println("���α׷��� ����Ǿ����ϴ�."); // �ٹٲ��� �ڵ����� �ٴ� ���
	}
}
