package controlflow;

import java.util.Scanner;

public class IfEX3 {
	public static void main(String[] args) {
		System.out.print("�޴� >> ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();
		
		String result;
		// ���ڿ��̶�� ch.compareTo("A") == 0
		if (ch == 'A') result = "HELLO";
		else if (ch == 'B') result = "GOOD BYE";
		else result = "�߸��� �Է�";
		
		System.out.println(result + "\n���α׷� ����");
	}
}
