package basic;
import java.util.Scanner;

public class OpsEX3 {
	public static void main(String[] args) {
		// equals() : ���� ������ ���� ������ ���θ� �˷���
		// - �����ϰ� ��ġ/����ġ���θ� üũ ����
		// compareTo( ) : ������� ������
		// - ��ġ����ġ ���θ� �����µ�, ����/����� �ʿ��Ѱ�?
		System.out.print("���� 2�� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		// charAt( �ε��� ) : ���ڿ� �ε���
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		System.out.print("�ܾ� 2�� �Է� >> ");
		String word1 = sc.next();
		String word2 = sc.next();
		System.out.println("���� 2�� ����ġ���� : " + (ch1 != ch2));
		System.out.println("�ܾ� 2�� ��ġ���� : " + (word1.compareTo(word2) == 0));
	}
}
