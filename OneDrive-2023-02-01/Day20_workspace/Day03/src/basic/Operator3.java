package basic;
import java.util.Scanner;

public class Operator3 {
	public static void main(String[] args) {
		// ���迬���� : ũ�� ��
		System.out.print("���� 2�� >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// �������� ������ �ƴ϶�, boolean(����)�̴� ����
		System.out.println("���1 " + (num1 > num2));
		System.out.println("���2 " + (num1 < num2));
		System.out.println("���3 " + (num1 >= num2));
		System.out.println("���4 " + (num1 <= num2));
		System.out.println("���5 " + (num1 == num2));
		System.out.println("���6 " + (num1 != num2));
		// -------------- ���� �ڷ����� ��� : �Ȱ��� ����
		
		// -------------- ������� ��� ���迬���ڴ� ���� �ȵ�
		// C / C++ : �����Ҵ���� �������
		// ���̽� : ���Ӱ� ���� ���� �ٸ� ����Ʈ 2��(������ ���� ����)
		// - ����ÿ� ���� ���迬���� ���� �������/����Ʈ ����ü�� ����
		// - ���� ���빰�� �߿��ѵ�, �� ����ü�� ���ϴ� ���� ��
		String word1 = "ABC";
		System.out.println("����� ���1 : " + (word1 == "ABC"));
		String word2 = "ABC";
		System.out.println("����� ���2 : " + (word2 == "ABC"));
		String word3 = sc.next();
		System.out.println("����� ���3 : " + (word3 == word1));
		sc.close();
		
		// ��ü�� �񱳴� ���� �޼��带 ���ؼ� �����Ѵ�.
		// - compareTo( ) : ���빰�� ���ϰ�, ������ 0, �ٸ��� 0 �̿��� ��
		System.out.println("�ùٸ� ���1 : " + word3.compareTo(word1));
		// ������ : ���� �� ���� ����(+ ���� �󸶳� �� �䰡)
		System.out.println("�ùٸ� ���2 : " + word3.compareTo("AB"));
		// ������� : ���� �� ���� ����(ABC, CD���� ���� �ִ�)
		System.out.println("�ùٸ� ���3 : " + word3.compareTo("CD"));
		// �� ���߿� ������ �� ���� �߿���!
		
		double dis = 14.1;
		// ����(���ǽĵ��� �����ϴ� ������ �ϳ�)
		// -> 14��ġ�� ȭ��ũ�⸦ ã�� ����
		System.out.println("���� : "
				+ ((14 <= dis) && (dis < 15)));
		// ����(���ǽĵ��� �ϳ��̻� �����ϴ� ������)
		// -> 14��ġ �Ǵ� 15��ġ�� ȭ��ũ�⸦ ã�� ����
		System.out.println("���� : " +
				 ((14 <= dis) && (dis < 15) || (15 <= dis) && (dis < 16))
				 );
		// ����(���ǽ� ��Ȱ��)
		// -> ���ǽ��� ����� �����ϴµ� �̿���(����->����, ����->����)
		boolean result1 = (14 <= dis) && (dis < 15);
		boolean result2 = !result1; // (14 > dis) || (dis >= 15);
		System.out.println("���� : " + result1 + " " + result2);
	}
}





