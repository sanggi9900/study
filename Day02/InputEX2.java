package basic;
import java.util.Scanner;

public class InputEX2 {
	public static void main(String[] args) {
		System.out.print("�̸� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		// �ԷµǴ� ���� �������� �� �����ؼ� �غ��ؾ� ��
		String name = sc.next();
		System.out.print("���� �Է� >> ");
		int age = sc.nextInt();
		System.out.print("��� �Է� >> ");
		sc.nextLine();
		String hobby = sc.nextLine();
		sc.close();
		
		System.out.printf(
				"\n�� �̸��� %s�̰� ���̴� %d���Դϴ�.\n",name,age
				);
		System.out.println("��� : " + hobby);
		
	}
}
