package controlflow;
import java.util.Scanner;

public class LoopEX3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �� : while(true)�� �� ���, ��ü �ڵ带 �ݺ���Ų�ٰ�
		//     �����ϴ°� ���ϴ�.
		while (true) {
			System.out.print("���ұ�? >> ");
			// �߰�ȣ ���ο��� ������ �����ϸ�, �� ���ο����� ��� ����
			String menu = sc.next();
			if (menu.compareTo("����") == 0) break;

			String result = "Good ";
			if (menu.compareTo("��ħ") == 0) result += "Morning!";
			else if (menu.compareTo("����") == 0) result += "Afternoon!!";
			else if (menu.compareTo("����") == 0) result += "Evening!!!";
			else result = "WRONG INPUT...";
			System.out.println(result);
		}
		System.out.println("Bye Bye ~~");
		System.out.println("\n���α׷� ����");
	}
}
