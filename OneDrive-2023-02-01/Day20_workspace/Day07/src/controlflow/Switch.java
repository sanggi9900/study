package controlflow;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		// switch ��� : if else�� ������ �� �� ȿ�������� �����ϱ� ���� ���
		// - ���ǽ��� �̹� ���� ����( == ���迬���� )
		// - ���ǽ��� ������ �ȵǰ�, ��ġ���θ� ���� �� �ִ� �����θ� ����
		// - ���� �ڷ��� �� ��Ȯ�ϰ� �����Ǵ� ��Ȯ�� �͸� �̿� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("1. HELLO, 2. BYE >> ");
		int num = sc.nextInt();
		sc.close();
		// ����ġ - ������ �ش�ȭ��Ų ���
		// Ư¡ : case �� default�� ���� �ڵ��� ���������� �����Ѵ�.
		//      ���ӹ��� ���Ḧ ����, break�� ����Ѵ�.
		switch(num) {
		case 1:								// if (num == 1) {
			System.out.println("HELLO~!");	// 		System.out.println("HELLO~!");
			break;							// }
		case 2:								// if (num == 2) {
			System.out.println("BYE~!");	// 		System.out.println("BYE~!");
			break;							// }
		default:									// if(num != 1 && num != 2) {
			System.out.println("�߸��� �����Դϴ�.");	// 		System.out.println("�߸��� �����Դϴ�.");
			break; // �������� ���� ����					// } 
		}
	}
}






