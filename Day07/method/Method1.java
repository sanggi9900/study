package method;

import java.util.Scanner;

public class Method1 {
	public static void program(/*void ���ִ´�. ���� �� ��*/) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2�� �Է� >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("��� : " + (num1 + num2));
	}
	public static void main(String[] args) {
		// �޼��� : �ٸ� ����� �Լ��� �����Ǵ� ����
		// 1) �⺻������ �޼��� : �ϰ�� ������ ������ �ִ� �޼���.
		//    -> �ܺο� ��ȣ�ۿ����� �ʴ´�.
		
		// ���ǻ��� : Scanner�� �޼��忡�� close ó���ϸ� �ȵ�
		program();
		program();
		// ���� ���� : �ҽ����� -> ���α׷�(�ϳ��� ���ư�) -> 
		//         �Է���θ� �ڵ����� �����Ŵ(������)
		//         sc.close()�� �� �Է���ΰ� �ʿ䰡 ������
		//         ����(�������)�� �ϴ� ��.
		//         �ذ�å�� ������ ������ ��.
	}
}






