package controlflow;
import java.util.Scanner;
public class LoopEX6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 3;
		boolean result = false;
		while (count > 0) {
			System.out.print("ID �Է� >> ");	// ������ �޾ƿ� ���� �ҷ����� ��
			String userid = sc.next();
			if (userid.compareTo("User") != 0) {
				System.out.println("WRONG ID!"); // ������ ������ ����
			}
			else {
				System.out.print("PW �Է� >> ");	// ������ �޾ƿ� ���� �ҷ����� ��
				String userpw = sc.next();
				if (userpw.compareTo("it") != 0) {
					System.out.println("WRONG PW!"); // ������ ������ ����
				}
				else {
					result = true;
					break;
				}
			}
			count -= 1;
		}
		sc.close();
		if (result) System.out.println("LOGIN SUCCEED"); // ������ ������ ����
		else System.out.println("LOGIN BLOCKED");
	}
}
